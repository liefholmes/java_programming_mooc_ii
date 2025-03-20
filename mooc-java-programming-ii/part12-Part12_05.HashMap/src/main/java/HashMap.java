/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        // check if the List which contains the key in the array of List Pair exits
        if (this.values[hashValue] == null) {
            return null;
        }

        for (int i = 0; i < this.values[hashValue].size(); i++) {
            if (this.values[hashValue].get(i).getKey().equals(key)) {
                return this.values[hashValue].get(i).getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        // focus on the List at such hashValue
        List<Pair<K, V>> valuesAtIndex = this.getListBasedOnKey(key);
        // check if such key exist, if not exist -> add the <K, V> in the list :: if exist -> replace the value
        int index = getIndexBasedOnKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }
    
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }
        int index = getIndexBasedOnKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }
        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new List<>();
        }
        return this.values[hashValue];
    }

    private int getIndexBasedOnKey(List<Pair<K, V>> targetList, K key) {
        int index = -1;
        for (int i = 0; i < targetList.size(); i++) {
            if (targetList.get(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    private void grow() {
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];
        for (int i = 0; i < this.values.length; i ++) {
            copy(newArray, i);
        }
        
        this.values = newArray;
    }
    
    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i ++) {
            Pair<K, V> value = this.values[fromIdx].get(i);
            
            int hashValue = Math.abs(value.getKey().hashCode()%newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }
            newArray[hashValue].add(value);
        }
    }
}
