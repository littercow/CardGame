package cardgame;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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

        buttonReset = new JButton("<html>  Reset<br />the game</html>");
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
        try {
            cardImage = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/ressources/cards.png")).getSubimage((6 - 1) * 71, 5 * 96, 71, 96)));
        } catch (IOException ex) {
            Logger.getLogger(CardBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

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

        }
        if (e.getSource() == buttonReset) {
            deck1 = new CardDeck();
            ImageIcon cardBackImage = null;
            labelCardDrew.setText("New ordered deck");
            labelCardLeft.setText("card left: " + (deck1.getCardCount()));
            try {
                cardBackImage = new ImageIcon(ImageIO.read(getClass().getResource("/ressources/cards.png")).getSubimage((3 - 1) * 71, 5 * 96, 71, 96));
            } catch (IOException ex) {
                Logger.getLogger(CardBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
            cardImage.setIcon(cardBackImage);

        }

        if (e.getSource() == buttonShuffle) {
            deck1.shuffleCards();
            labelCardDrew.setText("new shuffled deck");
            labelCardLeft.setText("card left: " + (deck1.getCardCount()));
        }
    }
}
