import java.util.Scanner;

public class Largest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int s = sc.nextInt();
		int r = sc.nextInt();

		rotateShell(arr, s, r);
		display(arr);
	}

	private static void rotateShell(int[][] arr, int s, int r) {
		int oned[] = fill1DfromShell(arr, s);
		rotate1D(oned, r);
		fillShellfrom1D(oned,arr,s);
	}

	private static void fillShellfrom1D(int[] oned, int[][] arr, int s) {
		int minrow = s - 1;
		int mincol = s - 1;
		int maxrow = arr.length - s;
		int maxcol = arr[0].length - s;

		int idx = 0;
		for (int i = minrow, j = mincol; i <= maxrow; i++) {
			arr[i][j]=oned[idx];
			idx++;
		}
		mincol++;

		for (int i = mincol, j = maxrow; i <= maxcol; i++) {
			arr[j][i]=oned[idx];
			idx++;
		}
		maxrow--;

		for (int i = maxrow, j = maxcol; i >= minrow; i--) {
			arr[i][j]=oned[idx];
			idx++;
		}
		maxcol--;

		for (int i = maxcol, j = minrow; i >= mincol; i--) {
			arr[j][i]=oned[idx];
			idx++;
		}
	}

	private static int[] fill1DfromShell(int arr[][], int s) {
		int minrow = s - 1;
		int mincol = s - 1;
		int maxrow = arr.length - s;
		int maxcol = arr[0].length - s;
		int shellsize = 2 * (maxrow - minrow + maxcol - mincol);
		int a[] = new int[shellsize];

		int idx = 0;
		for (int i = minrow, j = mincol; i <= maxrow; i++) {
			a[idx] = arr[i][j];
			idx++;
		}
		mincol++;

		for (int i = mincol, j = maxrow; i <= maxcol; i++) {
			a[idx] = arr[j][i];
			idx++;
		}
		maxrow--;

		for (int i = maxrow, j = maxcol; i >= minrow; i--) {
			a[idx] = arr[i][j];
			idx++;
		}
		maxcol--;

		for (int i = maxcol, j = minrow; i >= mincol; i--) {
			a[idx] = arr[j][i];
			idx++;
		}
		return a;
	}

	private static void rotate1D(int[] oned, int r) {
		r = r % oned.length ;
		reverse(oned, 0, oned.length - r - 1);
		reverse(oned, oned.length - r, oned.length - 1);
		reverse(oned, 0, oned.length - 1);
	}

	private static void reverse(int[] oned, int m, int n) {
		for (int i = m, j = n; i < j; i++, j--) {
			int temp = oned[i];
			oned[i] = oned[j];
			oned[j] = temp;
		}
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
