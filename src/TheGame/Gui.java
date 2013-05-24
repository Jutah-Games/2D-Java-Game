package TheGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
	String tfs;
	String pfs = "myPass";
	
	private boolean loginU = false;
	private boolean loginP = false;
	
	JTextField tf = new JTextField(tfs, 10);
	JPasswordField pf = new JPasswordField(pfs, 10);
	
	public Gui() {
		setLayout(new FlowLayout());
		add(tf);
		add(pf);
		
		tf.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e){
						tfs = e.getActionCommand();
						System.out.println(tfs);
					}
				}
			);
		pf.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e){
						pfs = e.getActionCommand();
						System.out.println(pfs);
					}
				}
			);
	}
}
