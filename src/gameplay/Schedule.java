package gameplay;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Schedule extends JPanel{
	private static final long serialVersionUID = 1L;
	private ArrayList<String> binary;
	private ArrayList<Integer> decimal;
	private final static int NUMROOMS = 7; 
	public Schedule(){
        binary = new ArrayList<String>();
        decimal = new ArrayList<Integer>();
   
		for(int i = 0; i < 10; i++)
		{
			binary.add("");
			decimal.add(0);
		}
		generator();
	}
	
	private void generator(){
		
	}

	public ArrayList<String> getBinary() {
		return binary;
	}

	public ArrayList<Integer> getDecimal() {
		return decimal;
	}
}
