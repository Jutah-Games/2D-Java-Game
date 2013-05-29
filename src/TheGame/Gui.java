package TheGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
	
	String tfs = "Username";
	String pfs = "*****";
	JTextField tf;
	JPasswordField pf;
	JButton login;
	boolean loggedIn = false;
	
	public Gui(){
		setSize(1280, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLayout(new FlowLayout());
		login = new JButton("Login");
		tf  = new JTextField(tfs, 10);
		pf = new JPasswordField(pfs, 10);
		add(tf);
		add(pf);
		add(login);
		setVisible(true);
		
		login.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Login(tf.getText(), pf.getPassword());
					}
				}
			);
	}

	private <Password> void Login(String uN, Password pW) {
		if(uN.equals("deark")){
			loggedIn = true;
		}
		
		if(loggedIn == true) {
			JOptionPane.showMessageDialog(null, "Successfully Logged In");
			closeCurrent();
			}
		else
			JOptionPane.showMessageDialog(null, "Wrong username or password");
	}
	
	private void closeCurrent() {
		setVisible(false);
		Game game = new Game();
	}
}
