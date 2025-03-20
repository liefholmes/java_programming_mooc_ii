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
    
    private T[] list;
    private int firstEmptyIndex;
    
    public List() {
        this.list = (T[]) new Object[10];
        this.firstEmptyIndex = 0;
    }
    
    public void add(T value) {
        if (this.firstEmptyIndex == this.list.length) {
            T[] newList = (T[]) new Object[this.list.length + this.list.length/2];
            for (int i = 0; i < this.list.length; i ++) {
                newList[i] = this.list[i];
            }
            this.list = newList;
        }
        this.list[this.firstEmptyIndex] = value;
        this.firstEmptyIndex ++;
    }
    
    public void remove(T value) {
        if (indexOfValue(value) < 0) {
            return;
        }
        
        for (int i = indexOfValue(value); i < this.firstEmptyIndex - 1; i ++) {
            this.list[i] = this.list[i +1];
        }
        
        this.firstEmptyIndex --;
    }
    
    public int size() {
        return this.firstEmptyIndex;
    }
    
    public T value(int index) {
        if (index < 0 || index >= this.firstEmptyIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + "outside of [0, " + this.firstEmptyIndex + "]");
        }
        return this.list[index];
    }
    
    public int indexOfValue(T value) {
        
        for (int i = 0; i < this.firstEmptyIndex;  i ++) {
            if (this.list[i] == value || this.list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }
    
    
    
}
