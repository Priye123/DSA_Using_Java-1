package recursion_sameer;

import java.util.Scanner;

public class IsArraySorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(f(arr, 0));
		System.out.println(f1(arr, 0));
	}

	private static boolean f1(int[] arr, int idx) {
		if (idx == arr.length-2) {
			if(arr[idx]<arr[idx+1]) {
				return true;
			}else {
				return false;
			}
		}

		if(arr[idx]<arr[idx+1]) {
			return f1(arr,idx+1);
		}
		return false;
	}

	private static boolean f(int[] arr, int idx) {
		if (idx == arr.length) {
			return true;
		}

		if (arr[idx] < arr[idx + 1]) {
			return f(arr, idx + 1);
		} else {
			return false;
		}

	}

}
