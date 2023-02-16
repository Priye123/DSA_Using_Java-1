package stack;

import java.util.Scanner;
import java.util.Stack;

public class NGETR_Alt_Sol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<>();
		int ans[] = new int[n];
		st.push(arr[n - 1]);
		ans[n - 1] = -1;

		for (int i = n - 2; i >= 0; i--) {
			int ele = arr[i];
			while (st.size() > 0 && st.peek() < ele) {
				st.pop();
			}
			if (st.size() == 0)
				ans[i] = -1;
			else {
				ans[i] = st.peek();
			}
			st.push(ele);
		}

		for (int i = 0; i < n; i++)
			System.out.print(ans[i] + " ");
	}

}
