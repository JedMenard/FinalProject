package gameplay;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GUI extends JFrame implements KeyListener{
	private Board map;
	public GUI()
	{
		setSize(1110, 1040);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		map = new Board();
		add(map,BorderLayout.CENTER);
		add(map.getSchedule(),BorderLayout.EAST);
		addKeyListener(this);
	}
	
	
	public static void main(String[] args){
		GUI temp = new GUI();
		temp.setVisible(true);
	}


	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("almost done for the semester");
		
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			System.out.println("go up");
			map.setMoveChoice(Board.Direction.UP);
			map.movePlayer();
			repaint();
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("go left");
			map.setMoveChoice(Board.Direction.LEFT);
			map.movePlayer();
			repaint();
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("go right");
			map.setMoveChoice(Board.Direction.RIGHT);
			map.movePlayer();
			repaint();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("go down");
			map.setMoveChoice(Board.Direction.DOWN);
			map.movePlayer();
			repaint();
			break;
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
}
