package TheGame;

import javax.swing.JOptionPane;

public class Login {

	public boolean loggedIn = false;
	
	public <Password> Login(String uN, Password pW) { //String userName, String passWord
		if (uN.equals("deark")){
			loggedIn = true;
			JOptionPane.showMessageDialog(null, "Successfully Logged In");
		}
		else
			JOptionPane.showMessageDialog(null, "Wrong username or password");
	}
}
