package Utilities;

import java.util.ArrayList;
import java.util.List;
import Models.PlayingCard;

/**
 * Creates decks of cards
 * @author heshamsalman
 *
 */
public class CardFactory {
	public static List<PlayingCard> generateDeck() {
		List<PlayingCard> cards = new ArrayList<PlayingCard>();
		for (int i = 0; i < 4; i++) {
			String suit = "";
			switch (i) {
			case 0:
				suit = "club";
				break;
			case 1:
				suit = "diamond";
				break;
			case 2:
				suit = "heart";
				break;
			case 3:
				suit = "spade";
				break;
			default: 
				suit = "unknown";
			}
			for (int j = 0; j < 13; j++) {
				String rank = "";
				switch (j) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					Integer x = j + 1;
					rank = x.toString();
					break;
				case 10:
					rank = "j";
					break;
				case 11:
					rank = "q";
					break;
				case 12:
					rank = "k";
					break;
				}
				cards.add(new PlayingCard(suit, rank));
			}
		}

		return cards;
	}
}
