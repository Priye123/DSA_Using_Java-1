package stack;

import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		int k = sc.nextInt();

		int a[] = maxSlidingWindow(arr, k);

		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {

		int ngetr[] = new int[nums.length];
		Stack<Integer> st = new Stack<>();

		st.push(nums.length - 1);
		ngetr[nums.length - 1] = nums.length;

		for (int i = nums.length - 2; i >= 0; i--) {

			while (st.size() > 0 && nums[i] >= nums[st.peek()]) {
				st.pop();
			}
			if (st.size() == 0) {
				ngetr[i] = nums.length;
			} else {
				ngetr[i] = st.peek();
			}
			
			st.push(i);
		}

		int j = 0;
		int a[] = new int[(nums.length - k) + 1];
		for (int i = 0; i <= nums.length - k; i++) {
			if (j < i)
				j = i;

			while (ngetr[j] < i + k) {
				j = ngetr[j];
			}

			a[i] = nums[j];

		}
		return a;
	}

}
