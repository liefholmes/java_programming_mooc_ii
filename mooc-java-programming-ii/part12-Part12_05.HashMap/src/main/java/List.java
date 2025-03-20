/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class List<T> {
    
    private T[] values;
    private int firstEmptyIndex;
    
    public List() {
        this.values = (T[]) new Object[10];
        this.firstEmptyIndex = 0;
    }
    
    
    public void add(T value) {
        // check whether the list should grow 50%, if yes, grow!(which also finish the copy)
        this.grow();
        // add value to the list
        this.values[this.firstEmptyIndex] = value;
        //keep track of the the first index which is empty
        this.firstEmptyIndex ++;
        
    }
    
    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }
    
    public void remove(T value) {
        if (this.contains(value) == false) {
            return;
        }
        
        for (int i = indexOfValue(value); i < firstEmptyIndex -1; i ++) {
            this.values[i] = this.values[i+1];
        }
        this.firstEmptyIndex --;
    }
    
    public T get(int index) {
        return this.values[index];
    }
    
    public int size() {
        return this.firstEmptyIndex;
    }
    
    public void grow() {
        if (this.firstEmptyIndex == this.values.length) {
            T[] newValues = (T[]) new Object[this.values.length + this.values.length / 2];
            //copy old array to new one
            for (int i = 0; i < this.firstEmptyIndex; i ++) {
                newValues[i] = this.values[i];
            }
            this.values = newValues;
        }      
    }
    
    public int indexOfValue(T value) {
        for (int i = 0; i < this.firstEmptyIndex; i ++) {
            if (values[i] == value || values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
     
}
