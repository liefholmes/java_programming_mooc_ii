/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.information;

/**
 *
 * @author liefh
 */
public class Airplane {
    
    private String id;
    private int capacity;
    
    public Airplane() {
        
    }
    
    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public String toString() {
        return this.id + " (" + this.capacity + " capacity)";
    }
    
}
