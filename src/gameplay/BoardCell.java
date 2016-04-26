package gameplay;

import java.awt.Color;
import java.awt.Graphics;

public class BoardCell {
	private int row, column;
	private boolean hallway = true;
	private String binRep;
	private int deciRep;
	private final static int WIDTH = 50;
	private final static int HEIGHT = 50;
	
	public BoardCell(int row, int column, int deciRep, String binRep){
		this.row = row;
		this.column = column;
		this.deciRep = deciRep;
		this.binRep = binRep;
	}
	
	public void draw(Graphics g){
		if(hallway){
			g.setColor(Color.WHITE);
		}
		else{
			g.setColor(Color.BLACK);
		}
		g.fillRect(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
		g.setColor(Color.BLUE);
		g.drawRect(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
	}
	
	public boolean isRoom(){
		return !hallway;
	}

	public void setHallway(boolean hallway) {
		this.hallway = hallway;
	}
	
}
