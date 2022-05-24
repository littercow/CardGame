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
 * @author Carl
 */
public class CardSprite{
    
    BufferedImage cardsImage;
    
    final int imageWidth = 71;
    final int imageHeight = 96;
    
    public CardSprite() {
        try {
            //cardsImage = ImageIO.read(new File("../ressources/cards.png"));
            cardsImage = ImageIO.read(getClass().getResource("/ressources/cards.png"));
        } catch (IOException ex) {
            Logger.getLogger(CardSprite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public BufferedImage getCardImage(int value, Color color){        
        int y = 0;
        switch (color){
            case SPADE:
                y = 0;
                break;
            case CLUB:
                y = 2;
                break;
            case DIAMOND:
                y = 3;
                break;
            case HEART:
                y = 1;
                break;
        }
        
        y *= imageHeight;
        
        return cardsImage.getSubimage((value - 1) * imageWidth, y, imageWidth, imageHeight);
    }
    
}
