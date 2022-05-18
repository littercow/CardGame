/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame;

/**
 *
 * @author littercow
 */
public class Cardgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CardDeck deck1 = new CardDeck();
        //System.out.println(deck1);
        deck1.shuffleCards();
        //System.out.println(deck1);
        Card draw1 = deck1.drawCard();
        Card draw2 = deck1.drawCard();
        Card draw3 = deck1.drawCard();
        System.out.println(draw1);
        System.out.println(draw2);
        System.out.println(draw3);

    }

}
