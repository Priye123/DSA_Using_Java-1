package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		bubbleSort(arr);
		print(arr);
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 1; i <= arr.length - 1; i++) {

			for (int j = 1; j <= arr.length - 1; j++) {

				if (isSmaller(arr, j - 1, j)) {
					swap(arr, j - 1, j);
				}
			}
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static boolean isSmaller(int[] arr, int i, int j) {
		if (arr[i] < arr[j])
			return false;
		else
			return true;
	}

	private static void print(int[] arr) {
		for (int x : arr)
			System.out.println(x);
	}

}
