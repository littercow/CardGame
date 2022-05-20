/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author littercow
 */
public class CardDeck {

    Stack<Card> deckCards = new Stack();

    public CardDeck() {

        for (Color j : Color.values()) {
            for (int i = 0; i < 13; i++) {
                Card cards = new Card(i + 1, j);
                pushCard(cards);
                //System.out.println(cards);
            }

        }
        //pushCard(new Joker(true));
        //pushCard(new Joker(false));
    }

    public void pushCard(Card cards) {
        this.deckCards.push(cards);
    }

    public Card drawCard() {
        return this.deckCards.pop();
    }

    public void shuffleCards() {
        Random rnd = new Random(); //to have a fixed shuffle do Random(1)
        Collections.shuffle(deckCards, rnd);
    }
    
    public int getCardCount() {
        return deckCards.size();
    }

    @Override
    public String toString() {
        String toReturn = "my stack of card \n";
        for (Card i : deckCards) {
            toReturn += i + "\n";
        }
        return toReturn;
    }

}
