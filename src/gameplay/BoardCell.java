package gameplay;

import java.awt.Color;
import java.awt.Graphics;

public class BoardCell {
	private int row, column;
	private boolean hallway = true;
	public String binRep;
	public int deciRep;
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
			g.fillRect(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
			g.setColor(Color.BLUE);
			g.drawRect(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
		}
		else{
			g.setColor(Color.BLACK);
			g.fillRect(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
			g.setColor(Color.BLUE);
			g.drawRect(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
			g.setColor(Color.YELLOW);
			g.drawString(Integer.toString(deciRep),(int)((column+0.5)*WIDTH),(int)((row+0.5)*HEIGHT));
		}
		
	}
	
	public void setBinRep(String binRep) {
		this.binRep = binRep;
	}

	public void setDeciRep(int deciRep) {
		this.deciRep = deciRep;
	}

	public boolean isRoom(){
		return !hallway;
	}
	
	public void setHallway(boolean hallway) {
		this.hallway = hallway;
	}
	
}
