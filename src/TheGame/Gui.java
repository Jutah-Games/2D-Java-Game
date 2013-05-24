package TheGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
	String tfs;
	String pfs;
	JTextField tf;
	JPasswordField pf;
	
	public Gui() {
		setLayout(new FlowLayout());
		tf  = new JTextField(tfs, 10);
		pf = new JPasswordField(pfs, 10);
		add(tf);
	//	add(pf);
		
		tf.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e){
				//		tfs = e.getActionCommand();
						loginMethod();
					}
				}
			);
		pf.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e){
						pfs = e.getActionCommand();
						loginMethod();
					}
				}
			);
	}
	
	private void loginMethod(){
		if(tfs == "deark")
			JOptionPane.showMessageDialog(null, "Logged In Succesfully");
		else
			JOptionPane.showMessageDialog(null,  "Didn't work");
	}
}
