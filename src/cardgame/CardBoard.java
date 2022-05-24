/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Carl
 */
public class CardBoard {
    private CardDeck cardDeck;
    private JFrame frame;
    
    CardBoard(){
        //permet d'afficher une box pour ajouter les images de cartes
        frame = new JFrame("Game of cards");
        frame.setSize(800, 600);
        
        //Tres mauvaise pratique selon les internets
        frame.setLayout(null);
        
        cardDeck = new CardDeck();
        cardDeck.shuffleCards();
        
        Card card = cardDeck.drawCard();
        card.cardLabel.setBounds(50, 50, 71, 96);
        frame.add(card.cardLabel);
        
        
        card = cardDeck.drawCard();
        card.cardLabel.setBounds(75, 75, 71, 96);
        frame.add(card.cardLabel);
        
        card = cardDeck.drawCard();
        card.cardLabel.setBounds(100, 100, 71, 96);
        frame.add(card.cardLabel);
        
        card = cardDeck.drawCard();
        card.cardLabel.setBounds(125, 125, 71, 96);
        frame.add(card.cardLabel);
        
        card = cardDeck.drawCard();
        card.cardLabel.setBounds(125, 125, 71, 96);
        frame.add(card.cardLabel);
        //frame.setComponentZOrder(card.cardLabel, 0);
        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
