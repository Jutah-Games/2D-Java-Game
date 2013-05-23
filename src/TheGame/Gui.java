package TheGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
	String tfS;
	String pfS = "myPass";
	
	public Gui() {
		JTextField tf = new JTextField("Enter Username", 10);
		JPasswordField pf = new JPasswordField(pfS, 10);
		setLayout(new FlowLayout());
		add(tf);
		add(pf);
		
		TheHandler handler = new TheHandler();
		tf.addActionListener(handler);
		pf.addActionListener(handler);
	}
	
	private class TheHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
		}
		
	}
	
}
