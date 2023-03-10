import javax.swing.*;
import java.awt.Color;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 JFrame frame = new JFrame();
	     frame.setSize(200,200);
		 Color c = new Color(50, 100, 150);
	     Color brighterColor = c.brighter();
	     
	     frame.getContentPane().setBackground(brighterColor);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setVisible(true);
	     
	     

	}

}
