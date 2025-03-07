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
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> handOfCards;
    
    public Hand() {
        this.handOfCards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.handOfCards.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = handOfCards.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public ArrayList<Card> getHandOfCards() {
        return this.handOfCards;
    }
    
    public void sort() {
        Collections.sort(this.handOfCards);
    }
    
    public int compareTo(Hand handOfCards) {
        return this.handOfCards.stream().map(card -> card.getValue()).reduce(0, (sum, val ) -> sum + val )
                - handOfCards.getHandOfCards().stream().map(card -> card.getValue()).reduce(0, (sum, val ) -> sum + val );
    }
    
    public void sortBySuit() {
        Collections.sort(this.handOfCards, new BySuitInValueOrder());
    
    }
    
    
    
}
