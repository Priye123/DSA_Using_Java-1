import java.util.Scanner;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int minrow = 0;
		int mincol = 0;
		int maxrow = rows - 1;
		int maxcol = cols - 1;
		int tc = rows * cols;
		int cnt = 0;

		while (cnt < tc) {
			for (int i = minrow; i <= maxrow && cnt < tc; i++) {
				System.out.print(arr[i][mincol] + " ");
				cnt++;
			}
			mincol++;

			for (int i = mincol; i <= maxcol && cnt < tc; i++) {
				System.out.print(arr[maxrow][i] + " ");
				cnt++;
			}
			maxrow--;

			for (int i = maxrow; i >= minrow && cnt < tc; i--) {
				System.out.print(arr[i][maxcol] + " ");
				cnt++;
			}
			maxcol--;

			for (int i = maxcol; i >= mincol && cnt < tc; i--) {
				System.out.print(arr[minrow][i] + " ");
				cnt++;
			}
			minrow++;
		}
	}

}
