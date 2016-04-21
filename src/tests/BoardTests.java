package tests;
import static org.junit.Assert.*;

import org.junit.BeforeClass;

import gameplay.*;

import org.junit.Test;

public class BoardTests {
	static Board board;
	private final static int NUMROWS = 30;
	private final static int NUMCOLUMNS = 30;
	
	@BeforeClass
	public static void init(){
		board = new Board();
		
	}
	
	@Test
	public void setUpTest() {
		assertEquals(NUMROWS, board.getNumRows());
		assertEquals(NUMCOLUMNS, board.getNumCols());
	}

	@Test
	public void layoutTests(){
		// Tests that the 7 rooms are in the right place
		
		assertTrue((board.getMap())[0][0].isRoom());
		assertTrue((board.getMap())[8][4].isRoom());
		assertTrue((board.getMap())[9][23].isRoom());
		assertTrue((board.getMap())[13][0].isRoom());
		assertTrue((board.getMap())[20][8].isRoom());
		assertTrue((board.getMap())[19][23].isRoom());
		assertTrue((board.getMap())[29][29].isRoom());
		
		// Tests that hallways don't return as rooms
		assertFalse((board.getMap())[5][9].isRoom());
	}
	
	@Test
	public void playerPostiion(){
		// Tests that the player starts in the right place
		assertEquals(8, board.getPlayer().getRow());
		assertEquals(8, board.getPlayer().getColumn());
	}
}
