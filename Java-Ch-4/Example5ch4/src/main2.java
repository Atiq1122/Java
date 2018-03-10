import javax.swing.JFrame;

public class main2 {

	public static void main(String[] args) {
		main panel = new main();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);

	}

}
