package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Views.WindowFrame;

public class PrimaryController implements ActionListener {

	WindowFrame window; 
	
	public PrimaryController() { 
		window = new WindowFrame();
		window.register(this);
		window.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source instanceof JButton) {
			JButton b = (JButton) source; 
			if (b.getActionCommand().equalsIgnoreCase("start")) {
				window.start();
			} else if (b.getActionCommand().equalsIgnoreCase("Relax")) {
				window.relax();
			} else if (b.getActionCommand().equalsIgnoreCase("magic!")) {
				window.magic();
			}
		}
	}

}
