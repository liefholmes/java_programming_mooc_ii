/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class CD implements Packable {
    
    private String artist;
    private String name;
    private int pubYear;
    private double weight;
    
    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }
    
    public double weight() {
        return weight;
    }
    
    public String toString() {
        return artist + ": " + name + " (" + pubYear + ")";
    }
}
