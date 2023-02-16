package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MagneticForce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		int no_of_balls = sc.nextInt();

		Arrays.sort(arr);

		int low = 1, high = arr[size - 1] - arr[0],ans=1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (isDistancePossible(arr, no_of_balls, mid)) {
				ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}

		}
		System.out.println(ans);

	}

	private static boolean isDistancePossible(int[] arr, int no_of_balls, int mid) {

		int balls = 1;
		int lastPosition = arr[0];

		for (int i = 1; i < arr.length && balls <= no_of_balls; i++) {

			if (arr[i] >= lastPosition + mid) {
				balls++;
				lastPosition = arr[i];
			}
		}
		
		return balls >= no_of_balls;

	}

}
