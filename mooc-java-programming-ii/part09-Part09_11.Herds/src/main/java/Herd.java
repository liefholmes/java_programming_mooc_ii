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

public class Herd implements Movable {
    
    private ArrayList<Movable> herds;
    
    public Herd() {
        this.herds = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        herds.add(movable);
    }
    
    
    public void move(int dx, int dy) {
        for (Movable organism : herds) {
            organism.move(dx, dy);
        }
    }
    
    public String toString() {
        String toP = "";
        for(Movable organism: herds) {
            toP += organism.toString() + "\n";
        }
        return toP;
    }
    
}
