/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> vehicleR;
    public VehicleRegistry() {
        this.vehicleR = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleR.getOrDefault(licensePlate, "0").equals("0")) {
            vehicleR.put(licensePlate, owner);
            return true;
        } 
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return vehicleR.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (vehicleR.keySet().contains(licensePlate)) {
            vehicleR.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for(LicensePlate lp : vehicleR.keySet()) {
            System.out.println(lp);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : vehicleR.values()) {
            if (!(owners.contains(owner))) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
