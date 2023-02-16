package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt(); // 160
		targetSumPair(arr, target);

	}

	private static void targetSumPair(int[] arr, int target) {
		Arrays.sort(arr);
		int i = 0, j = arr.length - 1;

		while (i < j) {
			if (arr[i] + arr[j] < target) {
				i++;
			} else if (arr[i] + arr[j] > target) {
				j--;
			} else {
				System.out.println(arr[i] + "," + arr[j]);
				i++;
				j--;
			}
		}

	}

}
