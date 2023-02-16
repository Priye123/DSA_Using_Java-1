package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SmallestNumberFollowingPattern {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int n=Integer.parseInt(br.readLine());
		String s = br.readLine();
		Stack<Integer> st = new Stack<>();
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == 'D') {
				st.push(count);
				count++;
			} else if (ch == 'I') {
				st.push(count);
				while (!st.empty()) {
					System.out.print(st.pop());
				}
				count++;
			}
		}
		st.push(count);

		while (!st.empty()) {
			System.out.print(st.pop());
		}
	}
}
