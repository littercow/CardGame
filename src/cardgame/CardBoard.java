/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import javax.swing.JFrame;

/**
 *
 * @author Carl
 */
public class CardBoard {
    private CardDeck cardDeck;
    private final JFrame frame;
    
    CardBoard(){
        //permet d'afficher une box pour ajouter les images de cartes
        frame = new JFrame("Game of cards");
        frame.setSize(800, 600);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cardDeck = new CardDeck();
    }
}
