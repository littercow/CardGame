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
public class Joker extends Card {

    boolean bigJoker;

    public Joker(boolean bigJoker) {
        this.bigJoker = bigJoker;

        cardPicture2 = new ImageIcon(cardSprite.getJoker(bigJoker));

    }

    @Override
    public String toString() {
        return "Joker{" + "bigJoker=" + bigJoker + '}';
    }

}
