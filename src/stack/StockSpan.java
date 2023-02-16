package stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	// find NGETL
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<>();

		int ans[] = new int[n], count = 0;

		st.push(0);
		ans[0] = 1;

		for (int i = 1; i < n; i++) {
			int ele = arr[i];
			while (arr[st.peek()] > ele) {
				count++;
				ans[i] = i - st.peek();
				st.pop();
			}
			if (count == 0) {
				ans[i] = i + 1;
			} else {

			}
			st.push(i);
		}

	}

}
