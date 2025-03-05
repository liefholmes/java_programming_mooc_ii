/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double biggest = history.get(0);
        for (int i = 1; i < this.history.size(); i++) {
            if (biggest < this.history.get(i)) {
                biggest = this.history.get(i);
            }
        }
        return biggest;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double smallest = history.get(0);
        for (int i = 1; i < this.history.size(); i++) {
            if (smallest > this.history.get(i)) {
                smallest = this.history.get(i);
            }
        }
        return smallest;
    }

    public double average() {
        double total = 0;
        for (Double nums : this.history) {
            total += nums;
        }
        double average = total / this.history.size();
        return average;
    }

    public String toString() {
        return history.toString();
    }
}
