package Views;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
/**
 * 
 * @author heshamsalman
 *
 */

public class WindowFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardPanel cardView;
	private JScrollPane scroll;
	private ButtonPanel buttons;
	
	//Constructor
	public WindowFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(414, 736);
		setResizable(false);
		setLayout(new BorderLayout());
		cardView = new CardPanel();
		scroll = new JScrollPane();
		buttons = new ButtonPanel();
		scroll.setViewportView(cardView);
		scroll.setSize(414, 600);
		scroll.setVisible(false);
		add(scroll, BorderLayout.CENTER);
		buttons.setSize(414, 136);
		add(buttons, BorderLayout.SOUTH);
	}
	
	//Registers action listener with buttons 
	public void register(ActionListener l) {
		buttons.magic.addActionListener(l);
		buttons.relax.addActionListener(l);
		buttons.start.addActionListener(l);
	}
	
	public void start() {
		cardView.reshuffle();
		scroll.setVisible(true);
		scroll.updateUI();
		buttons.relax.setEnabled(true);
		buttons.start.setEnabled(false);
	}
	
	public void relax() {
		cardView.relax();
		scroll.updateUI();
		buttons.relax.setEnabled(false);
		buttons.magic.setEnabled(true);
	}
	
	public void magic() {
		cardView.magic();
		scroll.updateUI();
		buttons.magic.setEnabled(false);
		buttons.start.setEnabled(true);
	}
	
}
