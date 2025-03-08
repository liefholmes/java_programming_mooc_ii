/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author liefh
 */
package FlightControl.controlsystem;

import FlightControl.information.Airplane;
import FlightControl.information.Flight;
import FlightControl.information.Place;
import java.util.HashMap;
import java.util.Collection;

public class Logic {

    HashMap<String, Airplane> airplanes;
    HashMap<String, Flight> flights;
    HashMap<String, Place> places;

    public Logic() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String id, int capacity) {
        this.airplanes.putIfAbsent(id, new Airplane(id, capacity));
    }

    public void addFlight(Airplane airplane, String departure, String destination) {
        this.places.putIfAbsent(departure, new Place(departure));
        this.places.putIfAbsent(destination, new Place(destination));

        Flight newFlight = new Flight(airplane, this.places.get(departure), this.places.get(destination));

        this.flights.put(newFlight.toString(), newFlight);
    }

    public void addPlaces(Place place) {
        this.places.putIfAbsent(place.getName(), place);
    }

    public Airplane getAirplane(String airplaneID) {
        return this.airplanes.getOrDefault(airplaneID, null);
    }

    public void printAirplanes() {
        Collection planes = this.airplanes.values();
        planes.stream().forEach(plane -> System.out.println(plane));
    }

    public void printFlights() {
        Collection flightss = this.flights.values();
        flightss.stream().forEach(flight -> System.out.println(flight));
    }

}
