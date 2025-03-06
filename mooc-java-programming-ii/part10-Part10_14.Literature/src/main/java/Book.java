/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class Book {
    
    private String name;
    private int recommendationAge;
    
    public Book(String name, int nA) {
        this.name = name;
        this.recommendationAge = nA;
    }
    
    public String toString() {
        return this.name + " (recommended for " + this.recommendationAge + " year-olds or older)";
    }
    
    public int getnA() {
        return this.recommendationAge;
    }
    
    public String getName() {
        return this.name;
    }
}
