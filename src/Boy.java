import java.util.Scanner;

public class Boy {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			int svj = 0;
			for (int j = 1; j < n; j++) {
				if (arr[i][j] < arr[i][svj])
					svj = j;
			}

			int z = arr[i][svj];
			boolean flag = true;
			for (int k = 0; k < n; k++) {
				if (arr[k][svj] > z) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(z);
				System.exit(0);
			}
		}
		System.out.println("invalid input");
	}
}