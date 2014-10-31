/*Test class for board */
package is.ru.TicTacToe;
import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import static org.hamcrest.core.IsEqual.equalTo;

public class BoardTest {
       public static void main(String args[]) {
       org.junit.runner.JUnitCore.main("is.ru.stringcalculator.BoardTest");
    }

    @Test
    public void testSetTile(){
    	Board board = new Board();
    	board.setTile(1, 'X');
    	assertEquals('X', board.getTile(1));
    }

    @Test
    public void testTileIsSet(){
    	Board board = new Board();
    	board.setTile(9, 'O');
    	assertTrue(board.isTileSet(9));
    }

    @Test
    public void testIsBoardFull(){
    	Board board = new Board();
    	for(int i = 1; i < 10; i++){
    		board.setTile(i, 'O');
    	}
    	assertTrue(board.isFull());
    }

    @Test
    public void testIsBoardEmpty(){
    	Board board = new Board();
    	assertTrue(!board.isFull());
    }
}