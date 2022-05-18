/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

/**
 *
 * @author littercow
 */
public class Joker extends Card {

    boolean bigJoker;

    public Joker(boolean bigJoker, int cardNumber, Color cardColor) {
        super(cardNumber, cardColor);
        this.bigJoker = bigJoker;
    }

    public Joker(boolean bigJoker) {
        this.bigJoker = bigJoker;
    }

    @Override
    public String toString() {
        return "Joker{" + "bigJoker=" + bigJoker + '}';
    }

}
