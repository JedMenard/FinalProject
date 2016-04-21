package gameplay;
import com.sun.prism.Graphics;

public class BoardCell {
	private int row, column;
	private boolean hallway;
	private String binRep;
	private int deciRep;
	
	public BoardCell(int deciRep, String binRep){
		this.deciRep = deciRep;
		this.binRep = binRep;
	}
	
	public void draw(Graphics g){
		
	}
	
	public boolean isRoom(){
		return false;
	}
}
