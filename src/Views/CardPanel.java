package Views;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Models.Deck;
import Models.PlayingCard;

/**
 * The panel which contains all card objects. 
 * @author heshamsalman
 *
 */
public class CardPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Deck cards;
	
	public CardPanel() {
		setLayout(new GridLayout(13, 4));
		setSize(414, 600);
		cards = new Deck();
		for (PlayingCard c : cards.getCards()) {
			add(new JLabel(c));
		}
	}
	
	/**
	 * Reshuffles the deck in case the user wants to start a new game. 
	 */
	public void reshuffle() {
		removeAll();
		cards = new Deck();
		for (PlayingCard c : cards.getCards()) {
			add(new JLabel(c));
		}
	}
	
	/**
	 * Updates the UI for when the user clicks "MAGIC" 
	 */
	public void magic() {
		cards.magic();
		removeAll();
		for (PlayingCard c : cards.getCards()) {
			add(new JLabel(c));
		}
	}
	
	/**
	 * Updates UI for when the user clicks "RELAX" 
	 */
	public void relax() {
		cards.relax();
		removeAll();
		for (PlayingCard c : cards.getCards()) {
			add(new JLabel(c));
		}
	}
	
}
	
