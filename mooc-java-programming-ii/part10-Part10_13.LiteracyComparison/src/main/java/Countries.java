/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class Countries {
    
    private String name;
    private Double lr;
    private String gender;
    private int year;
    
    public Countries(String name, Double lr, String gender, int year) {
        this.name = name;
        this.lr = lr;
        this.gender = gender;
        this.year = year;
    }
    
    public String getCName() {
        return this.name;
    }
    
    public double getLr() {
        return this.lr;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String modGender() {
        String[] modified = this.gender.trim().split(" ");
        return modified[0];
    }
    
}
