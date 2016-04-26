package gameplay;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Board extends JPanel{
	private static final long serialVersionUID = 1L;
	private Player player;
	private static final int MAX_ROWS = 50;
	private static final int MAX_COLUMNS = 50; 
	private Schedule schedule;
	ArrayList<BoardCell> roomCells;
	private Direction moveChoice;

	private BoardCell[][] map = new BoardCell[MAX_ROWS][MAX_COLUMNS];
	private int numRows, numCols;

	public Board(){
		player = new Player();
		numRows = 0;
		numCols = 0;
		schedule = new Schedule();
		moveChoice = Direction.NONE;
		map = new BoardCell[30][30];
		for(int i = 0; i < 30;i++)
		{
			for(int j = 0; j < 30;j++)
			{
				map[i][j] = new BoardCell(0,"0");
			}
		}
	}




	public boolean playerInRoom(){
		return map[player.getRow()][player.getColumn()].isRoom();
	}
	public boolean keyTest = false;
	public class MovingListener implements KeyListener{
		@Override
		public void keyTyped(KeyEvent arg0) {
			keyTest = true;
			moveChoice = Direction.UP;
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
		}
		@Override
		public void keyReleased(KeyEvent arg0) {

		}
	}
	public void movePlayer(Direction direction){

	}	




	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int col = numCols-1; col >= 0; col--){
			for (int row = 0; row < numRows; row++){
				map[row][col].draw(g);
			}
		}
	}
		
	public boolean isKeyTest() {
		return keyTest;
	}
	public BoardCell[][] getMap() {
		return map;
	}
	public Direction getMoveChoice() {
		return moveChoice;
	}
	public int getNumRows() {
		return numRows;
	}
	public int getNumCols() {
		return numCols;
	}
	public Player getPlayer() {
		return player;
	}
	public enum Direction{
		UP, LEFT, DOWN, RIGHT, NONE;
	}
}
