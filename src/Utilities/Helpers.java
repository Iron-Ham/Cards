package Utilities;

public class Helpers {
	/**
	 * Finds the appropriate image for each card. 
	 * @param suit
	 * @param rank
	 * @return
	 */
	
	boolean red = false;
	
	public static String resolveImage(String suit, String rank) {
		if (suit.equals("club") || suit.equals("spade") 
								|| suit.equals("heart") 
								|| suit.equals("diamond"))
			return "Assets/" + suit + rank + ".png";
		else {
			return "Assets/unknown.png";
		}
	}
	
	/**
	 * A shortcut to the location of the "back" of each card. 
	 * @return
	 */
	public static String backImage() {
		return "Assets/back-red.png";
	}
}
