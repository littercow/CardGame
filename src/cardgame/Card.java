/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author littercow
 */
public class Card {

    int cardNumber;
    Color cardColor;
    static int maxCard = 13;
    CardSprite cardSprite = new CardSprite();
    JLabel cardPicture;
    ImageIcon cardPicture2;

    public Card(int cardNumber, Color cardColor) {
        this.cardNumber = cardNumber;
        this.cardColor = cardColor;

        BufferedImage cardImage = cardSprite.getCardImage(this.cardNumber, this.cardColor);
        cardPicture = new JLabel(new ImageIcon(cardImage));
        cardPicture2 = new ImageIcon(cardImage);
    }

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" + "cardNumber=" + cardNumber + ", cardColor=" + cardColor + '}';
    }

}
