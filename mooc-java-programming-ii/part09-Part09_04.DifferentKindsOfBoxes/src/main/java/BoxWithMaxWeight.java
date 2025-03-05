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

public class BoxWithMaxWeight extends Box {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (item.getWeight() < this.maxWeight && total() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }
    
    public int  total() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        
        return total;
    }
    
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
