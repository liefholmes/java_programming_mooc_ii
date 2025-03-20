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

public class Hideout<T> {

    private T things;

    public Hideout() {
        
    }

    public void putIntoHideout(T toHide) {

        this.things = toHide;
    }
    
    public T takeFromHideout() {
        T temp = this.things;
        this.things = null;
        return temp;
    }
    
    public boolean isInHideout() {
        if (this.things == null) {
            return false;
        }
        return true;
    }

}
