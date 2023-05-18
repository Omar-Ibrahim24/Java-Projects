package game;

import java.util.Scanner;

public class Board {
	public static int row, column;
	public static int row_size = 3;
	public static int column_Size = 3;
	public static char[][] board = new char[row_size][column_Size];
	public static int turn = 1;
	static Scanner input = new Scanner(System.in);
//this function is to initialize the board
	public static void initilliazer(char[][] x) {
		int i, j;
		for (i = 0; i < row_size; i++) {
			for (j = 0; j < column_Size; j++) {
				x[i][j] = '_';
				System.out.print(x[i][j]);
				System.out.print("  ");
				System.out.print("|");
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
//this function is the main playing function
	public static void playing(char[][] board, int n) {
		int x, y;
//if n%2 ==0 then its player number 2's turn
		if (n % 2 == 0) {
			while (true) {
				System.out.printf("\t\tRound %d\n ", n);
				System.out.println("Player2 Choose where do u want to play");
				System.out.print("Row Number:");
				x = input.nextInt();
				System.out.print("Coulmn Number:");
				y = input.nextInt();
// row and column is lowered by 1 so it fits the initialized board.
				row = x - 1;
				column = y - 1;
//sending the board to a function to check whether the place exist or not
				if (check(board, row, column) == true) {
					board[row][column] = 'O';
					break;
				}
			}
		} else {
			while (true) {
				System.out.printf("\t\tRound %d\n ", n);
				System.out.println("Player1 Choose where do u want to play");
				System.out.print("Row Number:");
				x = input.nextInt();
				System.out.print("Coulmn Number:");
				y = input.nextInt();
				row = x - 1;
				column = y - 1;
				if (check(board, row, column) == true) {
					board[row][column] = 'X';
					break;
				}
			}
		}
	}
//This function is to check whether the entered row and column matched the board or not or to check whether the place is already taken or not
	public static boolean check(char[][] x, int y, int z) {
		if (y > 6 || y < 0 || z > 6 || z < 0) {
			System.out.println("\n		WRONGE PLACE.\n");
			display(x);
			return false;
		} else if (x[y][z] == 'X' || x[y][z] == 'O') {
			System.out.println("\n		WRONGE PLACE.\n");
			display(x);
			return false;
		} else 
			return true;
		
	}
//This is a function to display the board each round.
	public static void display(char[][] board2) {
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < column_Size; j++) {
				System.out.print(board2[i][j]);
				System.out.print("  ");
				System.out.print("|");
				System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
//This is a function to determine which player won the game.
	public static void winner(int n) {
		if ((n - 1) % 2 == 0)
			System.out.println("Player 2 Wins");
		else
			System.out.println("Player 1 Wins");
	}
}