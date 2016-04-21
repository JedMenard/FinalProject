package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.javafx.scene.traversal.Direction;

import gameplay.Board;

public class KeyPressedTests {
	static Board board;
	
	@BeforeClass
	public static void init(){
		board = new Board();
	}
	
	@Test
	public void test() {
		if (!board.isKeyTest())
		{
			assertEquals(board.getMoveChoice(), Board.Direction.UP);
		}
	}

	
	@Test
	public void moveTests(){
		board.getPlayer().setRow(3);
		board.getPlayer().setColumn(3);
		
		board.movePlayer(Board.Direction.UP);
		assertEquals(2, board.getPlayer().getRow());
		assertEquals(3, board.getPlayer().getColumn());
		
		board.movePlayer(Board.Direction.DOWN);
		assertEquals(3, board.getPlayer().getRow());
		assertEquals(3, board.getPlayer().getColumn());
		
		board.movePlayer(Board.Direction.LEFT);
		assertEquals(3, board.getPlayer().getRow());
		assertEquals(2, board.getPlayer().getColumn());
		
		board.movePlayer(Board.Direction.RIGHT);
		assertEquals(3, board.getPlayer().getRow());
		assertEquals(3, board.getPlayer().getColumn());
	}
}
