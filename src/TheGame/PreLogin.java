package TheGame;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreLogin extends JFrame {

	String tfs = "Username";
	String pfs = "*****";
	JTextField tf;
	JPasswordField pf;
	JButton login;
	Login l;
	
	public PreLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 600);
		setResizable(true);
		setVisible(true);
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
						l = new Login(tf.getText(), pf.getPassword());
					}
				}
			);
	}
}
