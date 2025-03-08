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
public class Flight {

    private Airplane airplane;
    private Place start;
    private Place end;

    public Flight(Airplane airplane, Place start, Place end) {
        this.airplane = airplane;
        this.start = start;
        this.end = end;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getStart() {
        return this.start;
    }

    public Place getEnd() {
        return this.end;
    }
    
    public String toString() {
        return airplane.toString() + " (" + this.start.getName() + "-" + this.end.getName() + ")";
    }
}
