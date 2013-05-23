package TheGame;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
	
	public Gui() {
		JTextField tf = new JTextField();
		tf.setBackground(Color.YELLOW);
		add(tf, BorderLayout.SOUTH);
	}
}
