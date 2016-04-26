package gameplay;
import java.util.ArrayList;

public class Player {
	private ArrayList<String> schedule;
	private int row, column;
	public Player(int row, int column){
		this.row = row;
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	
}
