package is.ru.TicTacToe;

public class TicTacToe{

	private Player player1;
	private Player player2;
	private Board board;

	public TicTacToe(String name1, String name2) {
		player1 = new Player(name1, 'X');
		player2 = new Player(name2, 'X');
		board = new Board();
	}

	public static void main(String[] args){
		
	}

}
