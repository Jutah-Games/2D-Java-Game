package TheGame;

public class Gui {

	public Gui(){
		PreLogin pl = new PreLogin();
	}
	
	
	
	/*	String tfs = "Username";
	String pfs = "*****";
	JTextField tf;
	JPasswordField pf;
	JButton login;
	Login l;
	
	public Gui() {
		guiMethod();
	}
	
	public void guiMethod() {
		if(l.loggedIn == false)
			preLogin();
	}
	
	private void preLogin() {
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
		guiMethod();
	}*/
}
