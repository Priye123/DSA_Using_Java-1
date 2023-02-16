package recursion_sameer;

import java.util.Arrays;
import java.util.Scanner;

public class PatternProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		// invertedTriangle(n,1);//row=n,col=1
		// invertedTriangle1(1,1,n);
		// invertedTriangle2(n,1);

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		bubbleSort(arr, n-1, 0);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr, int row, int col) {
		if (row == 0) {
			return;
		}

		if (col < row) {
//			System.out.print("*");
//			invertedTriangle(row, col+1);

			if (arr[col] > arr[col + 1]) {
				// swap
				int temp = arr[col];
				arr[col] = arr[col + 1];
				arr[col + 1] = temp;
			}

			bubbleSort(arr, row, col + 1);

		} else { // col>=row
			bubbleSort(arr, row - 1, 0);
		}
	}

	private static void invertedTriangle2(int row, int col) {
		if (row == 0) {
			return;
		}

		if (col <= row) {
			invertedTriangle2(row, col + 1);
			System.out.print("*");
		} else {
			invertedTriangle2(row - 1, 1);
			System.out.println();
		}
	}

	// not able to do with faith-expectation
	private static void invertedTriangle1(int row, int col, int length) {

		if (row == length + 1) {
			return;
		}
		invertedTriangle1(row + 1, col + 1, length);

		for (col = 1; col <= row; col++) {
			System.out.print("*");
		}
		System.out.println();

	}

	private static void invertedTriangle(int row, int col) {

		if (row == 0) {
			return;
		}
//		
//		if(col<=row) {
//			System.out.print("*");
//			invertedTriangle(row, col+1);
//		}else {
//			System.out.println();
//			invertedTriangle(row-1, 1);
//		}

		// self-work
		for (col = 1; col <= row; col++) {
			System.out.print("*");
		}

		System.out.println();

		invertedTriangle(row - 1, 1);// Faith

	}

}
