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

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxCapacity) {
            items.add(item);
        }
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }

}
