package game;

public class Main {

	public static void main(String[] args) {
		System.out.println("\t\tWelcome to Tic Tae Toc Game\t\t");
// when the code is started the board is automatically initialized.
		Board.initilliazer(Board.board);
// this while loop to avoid useless checking in the first 4 moves.
		while (Board.turn <= 5) {
			Board.playing(Board.board, Board.turn);
			Board.display(Board.board);
			Board.turn++;
		}
//this while loop keeps the game going on until someone wins.
		while (WinningCheck.rowComplete(Board.board, Board.row, Board.column) == false
				&& WinningCheck.columnComplete(Board.board, Board.row, Board.column) == false
				&& WinningCheck.diagonal1Complete(Board.board, Board.row, Board.column) == false
				&& WinningCheck.diagonal2Complete(Board.board, Board.row, Board.column) == false) {
			if (Board.turn <= 42) {
				Board.playing(Board.board, Board.turn);
				Board.display(Board.board);
				Board.turn++;
			} else
				break;
		}
// Either while loop is broken so its draw or on of the conditions came true so someone wins.		
		if (Board.turn == 43)
			System.out.println("The Game is Draw");

		else
			Board.winner(Board.turn);
	}
}