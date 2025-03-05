/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class Container {
    
    private int amount;
    public String name;
    
    public Container(String name) {
        this.name = name;
        this.amount = 0;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.amount + amount >= 100) {
            this.amount = 100;
            return;
        }
        this.amount = this.amount + amount;
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.amount - amount <= 0) {
            this.amount = 0;
            return;
        }
        this.amount = this.amount - amount;
    }
    
    public int getAmount() {
        return this.amount;
    }
   
    
    public String toString() {
        return name + ": " + amount + "/100";
     }
}
