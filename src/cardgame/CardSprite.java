/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author littercow
 */
public class CardSprite {

    BufferedImage originalImage;
    int imageWidth = 71;
    int imageHeight = 96;

    public CardSprite() {
        try {
            originalImage = ImageIO.read(new File("src/ressources/cards.png"));
        } catch (IOException ex) {
            Logger.getLogger(CardSprite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BufferedImage getCardImage(int cardNumber, Color couleur) {
        int y = 0;
        switch (couleur) {
            case SPADE:
                y = 0;
                break;

            case HEART:
                y = 1;
                break;
            case CLUB:
                y = 2;
                break;
            case DIAMOND:
                y = 3;
                break;
            default:
                throw new AssertionError();
        }
        y *= imageHeight;

        return originalImage.getSubimage((cardNumber - 1) * imageWidth, y, imageWidth, imageHeight);

    }

}
