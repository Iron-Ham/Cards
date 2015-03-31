package Models;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import Utilities.Helpers;

/**
 * An implementation of Card
 * @author heshamsalman
 *
 */
public class PlayingCard extends ImageIcon implements Card  {
	private static final long serialVersionUID = 5295788387913341230L;
	private String suit;
	private String rank;
	private ImageIcon back;
	private ImageIcon front;
	private boolean flipped = false;
	
	//Default constructor
	public PlayingCard() {
		suit = "";
		rank = "";
		try {
			back = imagePrep(new ImageIcon(ImageIO.read(new File(Helpers.backImage()))));
		} catch (IOException e) {
			System.out.println("Failed to initialize back image");
			System.exit(1);
		}
		try { 
			front = imagePrep(new ImageIcon(ImageIO.read(new File(Helpers.resolveImage(suit, rank)))));
		} catch (IOException e) {
			System.out.println("Failed to initialize front image");
			System.exit(1);
		}
		setImage(back.getImage());
	}
	
	//Parameterized Constructor
	public PlayingCard(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
		try {
			back = imagePrep(new ImageIcon(ImageIO.read(new File(Helpers.backImage()))));
		} catch (IOException e) {
			System.out.println("Failed to initialize back image");
			System.exit(1);
		}
		try { 
			front = imagePrep(new ImageIcon(ImageIO.read(new File(Helpers.resolveImage(suit, rank)))));
		} catch (IOException e) {
			System.out.println("Failed to initialize front image");
			System.exit(1);
		}
		setImage(back.getImage());
	}
	
	@Override
	public void flip() {
		if (flipped) {
			setImage(back.getImage());
			flipped = false;
		} else {
			setImage(front.getImage());
			flipped = true;
		}
	}
	
	//Sets images to be 100px wide, scaled height
	private ImageIcon imagePrep(ImageIcon icon) {
		double imageWidth = icon.getIconWidth();
		int imageHeight = icon.getIconHeight();
		imageWidth = 100.0/imageWidth;
		imageHeight = (int) (imageWidth * imageHeight);
		Image img = icon.getImage();
		ImageIcon i = new ImageIcon(img.getScaledInstance(100, imageHeight, Image.SCALE_SMOOTH));
		return i;
	}

}
