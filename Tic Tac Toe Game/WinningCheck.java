package game;

public class WinningCheck {
// This is a function to check winning due to 3 same sign in the same row
	public static boolean rowComplete(char[][] x, int y, int z) {
		int counter = 0;
		if (z <= 5 && x[y][z] == x[y][z + 1]) {
			counter++;
			if (z + 1 < 6 && x[y][z] == x[y][z + 2]) {
				counter++;
			}
		}
		if (z >= 1 && x[y][z] == x[y][z - 1]) {
			counter++;
			if ((z - 1) > 0 && x[y][z] == x[y][z - 2]) {
				counter++;
			}
		}
		if (counter >= 2)
			return true;
		else
			return false;
	}
// This is a function to check winning due to 3 same sign in the same column

	public static boolean columnComplete(char[][] x, int y, int z) {
		int counter = 0;
		if (y <= 4 && x[y][z] == x[y + 1][z]) {
			counter++;
			if (y + 1 < 5 && x[y][z] == x[y + 2][z]) {
				counter++;
			}
		}
		if (y >= 1 && x[y][z] == x[y - 1][z]) {
			counter++;
			if ((y - 1) > 0 && x[y][z] == x[y - 2][z]) {
				counter++;
			}
		}
		if (counter >= 2)
			return true;
		else
			return false;
	}
// This is a function to check winning due to 3 same sign in the same negative
// diagonal

	public static boolean diagonal1Complete(char[][] x, int y, int z) {
		int counter = 0;
		if (y <= 4 && z <= 5 && x[y][z] == x[y + 1][z + 1]) {
			counter++;
			if (y + 1 < 5 && z + 1 < 6 && x[y][z] == x[y + 2][z + 2]) {
				counter++;
			}
		}
		if (y >= 1 && z >= 1 && x[y][z] == x[y - 1][z - 1]) {
			counter++;
			if ((y - 1) > 0 && (z - 1) > 0 && x[y][z] == x[y - 2][z - 2]) {
				counter++;
			}
		}
		if (counter >= 2)
			return true;
		else
			return false;
	}
// This is a function to check winning due to 3 same sign in the same positive
// diagonal

	public static boolean diagonal2Complete(char[][] x, int y, int z) {
		int counter = 0;
		if (y <= 4 && y >= 1 && z <= 5 && z >= 1) {
			if (x[y][z] == x[y - 1][z + 1])
				counter++;
			if (x[y][z] == x[y + 1][z - 1])
				counter++;
			if (y + 1 < 5 && z + 1 < 6 && y - 1 > 0 && z - 1 > 0) {
				if (x[y][z] == x[y - 2][z + 2])
					counter++;
				if (x[y][z] == x[y + 2][z - 2])
					counter++;
			}
		}
		if (counter >= 2)
			return true;
		else
			return false;
	}
}