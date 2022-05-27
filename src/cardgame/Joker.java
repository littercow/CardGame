/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import javax.swing.ImageIcon;

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
