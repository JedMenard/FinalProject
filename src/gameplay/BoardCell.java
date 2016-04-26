package gameplay;

import java.awt.Color;
import java.awt.Graphics;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Wildcard;

public class BoardCell {
	private int row, column;
	private boolean hallway;
	private String binRep;
	private int deciRep;
	private final static int WIDTH = 50;
	private final static int HEIGHT = 50;
	
	public BoardCell(int deciRep, String binRep){
		this.deciRep = deciRep;
		this.binRep = binRep;
	}
	
	public void draw(Graphics g){
		if(hallway){
			g.setColor(Color.BLACK);
		}
		else{
			g.setColor(Color.WHITE);
		}
		g.fillRect(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
		g.drawRect(column*WIDTH, row*HEIGHT, WIDTH, HEIGHT);
	}
	
	public boolean isRoom(){
		return false;
	}
}
