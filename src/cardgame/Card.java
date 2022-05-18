/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

/**
 *
 * @author littercow
 */
public class Card {

    int cardNumber;
    Color cardColor;
    static int maxCard = 13;

    public Card(int cardNumber, Color cardColor) {
        this.cardNumber = cardNumber;
        this.cardColor = cardColor;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" + "cardNumber=" + cardNumber + ", cardColor=" + cardColor + '}';
    }

}
