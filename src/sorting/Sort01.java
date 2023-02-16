package sorting;

import java.util.Scanner;

public class Sort01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int i = 0, j = 0;

		while (i < arr.length) {
			if (arr[i] == 1) {
				swap(arr, i, j);
				i++;
				j++;
			} else {
				i++;
			}
		}
		
		for(int h:arr) {
			System.out.print(h+" ");
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
