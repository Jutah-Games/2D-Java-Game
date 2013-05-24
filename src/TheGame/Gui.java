package TheGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
	String tfs = "Username";
	String pfs;
	JTextField tf;
	JPasswordField pf;
	JButton login;
	
	public Gui() {
		setLayout(new FlowLayout());
		login = new JButton("Login");
		tf  = new JTextField(tfs, 10);
		pf = new JPasswordField(pfs, 10);
		add(tf);
		add(pf);
		add(login);
		
		login.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				}
			);
	}
}
