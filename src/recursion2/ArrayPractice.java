package recursion2;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		// System.out.println(isSorted(arr, 0));
		int target = sc.nextInt();
		System.out.println(linearSearch(arr, target, 0));
	}

	private static int linearSearch(int[] arr, int target, int idx) {
		if (idx == arr.length - 1) {
			return -1;
		}

		if(arr[idx]==target) {
			return idx;
		}

		return linearSearch(arr, target, idx + 1);
	}

	private static boolean isSorted(int[] arr, int idx) {

		if (idx == arr.length - 2) {
			if (arr[idx] > arr[idx + 1]) {
				return false;
			} else {
				return true;
			}
		}

		if (arr[idx] > arr[idx + 1]) {
			return false;
		}

		return isSorted(arr, idx + 1);

	}

}
