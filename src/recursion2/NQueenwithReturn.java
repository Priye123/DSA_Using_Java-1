package recursion2;

import java.util.ArrayList;

public class NQueenwithReturn {

	public static void main(String[] args) {
		int[][] chess = new int[4][4];
		System.out.println(printNQueens(chess, 0));
	}

	public static ArrayList<String> m;

	private static ArrayList<String> printNQueens(int[][] chess, int row) {

		if (row == chess.length) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		for (int col = 0; col < chess[0].length; col++) {

			if (isQueenSafe(chess, row, col)) {

				chess[row][col] = 1;
				ArrayList<String> s = printNQueens(chess, row + 1);
				m = new ArrayList<>();
				for (String e : s)
					m.add(e + "," + row + "-" + col + ".");

				chess[row][col] = 0;
			}
		}
		return m;
	}

	private static boolean isQueenSafe(int[][] chess, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (chess[i][col] == 1)
				return false;
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == 1)
				return false;
		}

		for (int i = row, j = col; i >= 0 && j <= chess[0].length - 1; i--, j++) {
			if (chess[i][j] == 1)
				return false;
		}

		return true;
	}
}
