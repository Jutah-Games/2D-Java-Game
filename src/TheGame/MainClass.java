package TheGame;

import javax.swing.*;

public class MainClass {

	public static void main(String args[]){
		Gui g = new Gui();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(800, 600);
		g.setResizable(false);
		g.setVisible(true);
	}
}
