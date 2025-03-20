/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
import java.util.ArrayList;

public class Pipe<T> {
    
    private ArrayList<T> stuffs;
            
    public Pipe() {
        this.stuffs = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.stuffs.add(value);
    }
    
    public T takeFromPipe() {
        T temp = this.stuffs.get(0);
        this.stuffs.remove(0);
        return temp;
    }
    
    public boolean isInPipe() {
        return this.stuffs.size() >0;
    }
    
}
