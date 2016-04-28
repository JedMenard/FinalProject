package gameplay;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GUI extends JFrame{
	private Board map;
	public GUI()
	{
		setSize(1110, 1040);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		map = new Board();
		add(map,BorderLayout.CENTER);
		add(new Schedule(), BorderLayout.EAST);
	}
	
	
	public static void main(String[] args){
		GUI temp = new GUI();
		temp.setVisible(true);
	}
}
