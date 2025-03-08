/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author liefh
 */
public class TemperatureSensor implements Sensor {

    private int num;
    private int status;

    public TemperatureSensor (){
        
    }

    public boolean isOn() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public void setOn() {
        this.status = 1;
    }

    public void setOff() {
        this.status = 0;
    }

    public int read() {
        if (this.status == 0) {
            throw new IllegalStateException("");
        }

        int val = new Random().nextInt(61) - 30;
        return val;

    }
}
