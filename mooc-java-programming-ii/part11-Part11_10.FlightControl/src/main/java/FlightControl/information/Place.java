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
public class Place {
    
    private String placeName;
    
    public Place(String name) {
        this.placeName = name;
    }
    
    public String getName() {
        return this.placeName;
    }
    
}
