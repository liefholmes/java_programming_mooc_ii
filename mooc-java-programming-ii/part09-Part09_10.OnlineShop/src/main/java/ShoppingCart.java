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
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    
    private Map<String, Item> shoppingCart;
    
    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }
    
    public void add(String product, int price) {

        if (shoppingCart.containsKey(product)) {
            shoppingCart.get(product).increaseQuantity();
            return;
        }
        shoppingCart.put(product, new Item(product, 1, price));
    }
    
    public int price() {
        int totalP = 0;
        for (Item item : shoppingCart.values()) {
            totalP += item.price();
        }
        return totalP;
    }
    
    public void print() {
        for (Item item: shoppingCart.values()) {
            System.out.println(item);
        }
    }
}
