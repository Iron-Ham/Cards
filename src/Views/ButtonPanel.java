package Views;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * ButtonPanel is the bottom panel which holds the three buttons, start, relax, and magic. 
 * @author heshamsalman
 *
 */
public class ButtonPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	JButton[] buttons;
	JButton start;
	JButton relax;
	JButton magic;
	
	public ButtonPanel() { 
		setLayout(new FlowLayout());
		start = new JButton("Start");
		relax = new JButton("Relax");
		magic = new JButton("Magic!");
		relax.setEnabled(false);
		magic.setEnabled(false);
		add(start);
		add(relax);
		add(magic);
	}
	
}
