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

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (!this.storage.containsKey(storageUnit)) {
            return;
        }
        ArrayList<String> items = storage.get(storageUnit);
        int key = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                key = i;
                break;
            }
        }
        storage.get(storageUnit).remove(key);
        if (storage.get(storageUnit).size() == 0) {
            storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageWithItems = new ArrayList<>();
        for (String unit : storage.keySet()) {
            if (storage.get(unit).size() > 0) {
                storageWithItems.add(unit);
            }
        }
        return storageWithItems;
    }

}
