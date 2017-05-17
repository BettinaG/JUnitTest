package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void leeresBoard() {
		Board board = new Board();
		assertFalse(board.hasWinner());
	}
	
	@Test
	public void gueltigeMarkierungNoWin() throws Exception{
		Board board = new Board();
		board.setMark("X", 0, 0);
		assertFalse(board.hasWinner());
	}
	
	@Test
	public void gueltigeMarkierungWin() throws Exception{
		Board board = new Board();
		board.setMark("X", 0, 0);
		board.setMark("X", 1, 1);
		board.setMark("X", 2, 2);
		assertTrue(board.hasWinner());
	}

	@Test (expected = Exception.class)
	public void ungueltigeMarkierung() throws Exception{
		Board board = new Board();
		board.setMark("L", 0, 0);
		
	}
	
}
