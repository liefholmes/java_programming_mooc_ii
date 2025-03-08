/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 *
 * @author liefh
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings= new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }

    }

    public int read() {
        if (isOn() == false || sensors.isEmpty()) {
            throw new IllegalStateException("");
        }
        int total = 0;
        for (Sensor sensor : sensors) {
            total = total + sensor.read();
        }
        int average = total / sensors.size();
        readings.add(average);
        return average;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
