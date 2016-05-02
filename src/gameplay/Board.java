package gameplay;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
		schedule = new Schedule();
		moveChoice = Direction.NONE;
		map = new BoardCell[MAX_ROWS][MAX_COLUMNS];
		loadBoard();
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void loadBoard() {
		try {
			FileReader fin = new FileReader("BinMap.csv");
			Scanner in = new Scanner(fin);
			BoardCell[][]  tempBoard = new BoardCell[MAX_ROWS][MAX_COLUMNS];

			String str;
			int row = 0;
			int col = 0;
			int prevCol = 0;
			while(in.hasNextLine()){

				str = in.nextLine();
				col = 0;
				while(str.contains(",")){
					String cell = str.substring(0, str.indexOf(','));

					tempBoard[row][col] = new BoardCell(row, col, 0, null);
					if(cell.equals("R")) 
					{	
						tempBoard[row][col].setHallway(false);
						tempBoard[row][col].setBinRep((schedule.getBinary()).get(0));
						tempBoard[row][col].setDeciRep((schedule.getDecimal()).get(0));
						System.out.println();
						schedule.reduceList();
					}
					if(cell.equals("P")) player = new Player(row,col);
					col++;
					str = str.substring(str.indexOf(',')+1);
				}
				//repeat while loop once more to get last cell
				String cell = str;
				tempBoard[row][col] = new BoardCell(row, col, 0, null);
				col++;
				prevCol = col;
				row++;
			}
			numRows = row;
			numCols = col;

			for(int i = 0; i < numRows; i++){
				for(int j = 0; j < numCols; j++){
					map[i][j] = tempBoard[i][j];
				}
			}


			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("Failed to open load file.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Failed to close load file. Wat?");
			e.printStackTrace();
		}
	}

	public boolean keyTest = false;

	public void movePlayer(){
		switch(moveChoice){
		case UP:
			if (player.getRow() > 0)
				player.setRow(player.getRow()-1);
			break;
		case DOWN:
			if (player.getRow() + 1 < numRows)
				player.setRow(player.getRow()+1);
			break;
		case LEFT:
			if (player.getColumn() > 0)
				player.setColumn(player.getColumn()-1);
			break;
		case RIGHT:
			if (player.getColumn() + 1 < numCols)
				player.setColumn(player.getColumn()+1);
			break;
		}
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int col = numCols-1; col >= 0; col--){
			for (int row = 0; row < numRows; row++){
				map[row][col].draw(g);
			}
		}
		player.draw(g);
	}

	public boolean playerInRoom(){
		System.out.println(player.getRow());
		System.out.println(player.getColumn());
		return map[player.getRow()][player.getColumn()].isRoom();
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
	public void setMoveChoice(Direction moveChoice) {
		this.moveChoice = moveChoice;
	}
	public enum Direction{
		UP, LEFT, DOWN, RIGHT, NONE;
	}
}
