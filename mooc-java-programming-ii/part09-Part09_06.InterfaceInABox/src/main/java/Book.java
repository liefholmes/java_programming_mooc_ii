/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class Book implements Packable {
    
    private double weight;
    private String author;
    private String name;
    
    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return author + ": " + name;
    }
}
