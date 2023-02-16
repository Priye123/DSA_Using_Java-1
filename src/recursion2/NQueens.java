package recursion2;

import java.util.Scanner;

class NQueens {

	public static int totalNQueens(int n) {
		int arr[][] = new int[n][n];
		return printNQueens(arr, 0);
	}

	public static int printNQueens(int[][] chess, int row) {

		if (row == chess.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < chess[0].length; col++) {
			if (isQueenSafe(chess, row, col)) {
				chess[row][col] = 1;
				count = count + printNQueens(chess, row + 1);
				chess[row][col] = 0;
			}

		}
		return count;
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(totalNQueens(n));
	}

}
