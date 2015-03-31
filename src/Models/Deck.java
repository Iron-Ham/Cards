package Models;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import Utilities.CardFactory;

/**
 * The Deck class is a collection of card objects. 
 * @author heshamsalman
 *
 */
public class Deck {
	private List<PlayingCard> cards;
	
	//Constructor
	public Deck() {
		cards = CardFactory.generateDeck();
		Collections.shuffle(cards);
		cards.get(5).flip();
		cards.get(6).flip();
		cards.get(9).flip();
		cards.get(10).flip();
	}
	
	public List<PlayingCard> getCards() {
		return cards;
	}
	
	/**
	 * Removes cards that were initially shown to the user, adds in "dummy" cards (unknown cards)
	 */
	public void relax() {
		cards.remove(10);
		cards.remove(9);
		cards.remove(6);
		cards.remove(5);
		Collections.shuffle(cards);
		for (int i = 0; i < 4; i++) {
			cards.add(new PlayingCard());
		}
		cards.get(5).flip();
		cards.get(6).flip();
		cards.get(9).flip();
		cards.get(10).flip();
	}
	
	/**
	 * Shuffles the cards except for the four "dummy" cards that were added at the end. 
	 */
	public void magic() {
		Random rgen = new Random();
		cards.get(5).flip();
		cards.get(6).flip();
		cards.get(9).flip();
		cards.get(10).flip();

		for (int i = 0; i < cards.size() - 4; i++) {
			int randomPosition = rgen.nextInt(cards.size() - 4);
			PlayingCard tmp = cards.get(i);
			cards.set(i, cards.get(randomPosition));
			cards.set(randomPosition, tmp);
		}
		
		cards.get(5).flip();
		cards.get(6).flip();
		cards.get(9).flip();
	}
}
