package cardgame;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author littercow
 */
public class CardBoard implements ActionListener {

    JFrame frame;
    JLabel labelCardLeft, labelCardDrew;
    JLabel cardImage;
    JLabel labelTitre;
    JButton buttonNextCard, buttonReset, buttonShuffle;

    CardDeck deck1 = new CardDeck();
    JPanel panel;
    Font myFont = new Font("Ink Free", Font.BOLD, 20);
    //Card card = deck1.drawCard();

    public CardBoard() {
        deck1.shuffleCards();

        Border border = BorderFactory.createLineBorder(java.awt.Color.orange, 3);

        buttonNextCard = new JButton("Next Card");
        buttonNextCard.setFont(myFont);
        buttonNextCard.addActionListener(this);
        buttonNextCard.setBounds(600, 0, 150, 100);
        buttonNextCard.setBorder(border);

        buttonReset = new JButton("Reset the game");
        buttonReset.setFont(myFont);
        buttonReset.addActionListener(this);
        buttonReset.setBounds(600, 150, 150, 100);
        buttonReset.setBorder(border);

        buttonShuffle = new JButton("Shuffle");
        buttonShuffle.setFont(myFont);
        buttonShuffle.addActionListener(this);
        buttonShuffle.setBounds(600, 300, 150, 100);
        buttonShuffle.setBorder(border);

        //buttonNextCard.setBounds(50, 50, 100, 50);
        labelCardLeft = new JLabel("card left");
        labelCardLeft.setFont(myFont);
        labelCardLeft.setBorder(border);

        //cardImage =;
        //cardImage.setBounds(750, 50, 71, 96);
        labelCardDrew = new JLabel("card drew");
        labelCardDrew.setFont(myFont);
        labelCardDrew.setBorder(border);

        labelTitre = new JLabel("Carl and Jason");
        labelTitre.setFont(myFont);
        labelTitre.setBorder(border);

        frame = new JFrame("Draw Cards Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);

        //setting panel
        panel = new JPanel();
        panel.setBounds(50, 0, 500, 500);
        panel.setLayout(new GridLayout(0, 1));

        //add buton
        frame.add(buttonNextCard);
        frame.add(buttonReset);
        frame.add(buttonShuffle);
        //frame add label
        //Card card = deck1.;

        //CARL CODE POUR METTRE PICTURE
        Card card = deck1.drawCard();
        //card.cardPicture.setBounds(750, 50, 71, 96);
        cardImage = card.cardPicture;
        cardImage.setBorder(border);

        //frame.add(cardImage);
        //panel add label
        //frame.add(cardImage);
        //cardImage.setBounds(0, 0, 0, 0);
        panel.add(labelTitre);
        panel.add(labelCardLeft);
        panel.add(labelCardDrew);
        panel.add(cardImage);

        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonNextCard) {
            Card card = deck1.drawCard();
            labelCardDrew.setText(card.toString());
            labelCardLeft.setText("card left: " + (deck1.getCardCount()));
            cardImage.setIcon(card.cardPicture2);
            //cardImage.setText(card.cardPicture);

            //card.cardPicture.setBounds(750, 50, 71, 96);
            //frame.add(card.cardPicture);
        }
        if (e.getSource() == buttonReset) {
            deck1 = new CardDeck();
            labelCardDrew.setText("New ordered deck");
            labelCardLeft.setText("card left: " + (deck1.getCardCount()));
        }

        if (e.getSource() == buttonShuffle) {
            deck1.shuffleCards();
            labelCardDrew.setText("new shuffled deck");
            labelCardLeft.setText("card left: " + (deck1.getCardCount()));
        }
    }
}
