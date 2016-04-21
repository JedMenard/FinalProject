package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import gameplay.Board;

public class RoomTests {
	static Board board;
	
	@BeforeClass
	public static void init(){
		board = new Board();
	}
	
	@Test
	public void test() {
		// Player in a room
		board.getPlayer().setRow(29);
		board.getPlayer().setColumn(29);
		
		assertTrue(board.playerInRoom());
		
		board.getPlayer().setRow(0);
		board.getPlayer().setColumn(0);
		
		assertTrue(board.playerInRoom());
		
		board.getPlayer().setRow(8);
		board.getPlayer().setColumn(4);
		
		assertTrue(board.playerInRoom());
		
		// Not in a room
		board.getPlayer().setRow(5);
		board.getPlayer().setColumn(5);
		
		assertFalse(board.playerInRoom());
	}

}
