/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liefh
 */
public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return tacos;
    }

    public void eat() {
        if (this.tacosRemaining() == 0) {
            return;
        }
        this.tacos -= 1;
    }
}
