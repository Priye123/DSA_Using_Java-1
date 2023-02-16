import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int row = rows, col = cols;
		for (int i = 0; i < rows - 1; i++) {

			for (int j = i; j < row - i; j++)
				System.out.println(arr[j][i]);

			for (int j = i + 1; j < col - i; j++)
				System.out.println(arr[row - 1 - i][j]);

			for (int j = row - 2 - i; j >= i; j--)
				System.out.println(arr[j][col - 1 - i]);

			for (int j = col - 2 - i; j > i; j--)
				System.out.println(arr[i][j]);
		}

	}

}
