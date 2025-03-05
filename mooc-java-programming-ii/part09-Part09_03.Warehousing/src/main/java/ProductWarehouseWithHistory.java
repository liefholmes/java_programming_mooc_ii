/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    
    private ChangeHistory changeHistory = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory.add(initialBalance);
    }
    
    public String history() {
        return changeHistory.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return super.getBalance();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + changeHistory.toString());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }
    
}
