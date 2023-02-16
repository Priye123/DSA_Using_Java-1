package stack;

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		int flag = 0, count = 0;

		for (int i = 0; i < s.length(); i++) {
			count = 0;
			char ch = s.charAt(i);
			if (ch != ')') {
				st.push(ch);
			} else {
				while (st.peek() != '(') {
					st.pop();
					count++;
				}
				if (count == 0) {
					flag = 1;
					break;
				}
				st.pop();
//				if (st.size() > 0) {
//					if (st.peek() == '(') {
//						flag = 1;
//						break;
//					}
//				}

			}
		}

		if (flag == 1) {
			System.out.println("Duplicate Found");
		} else
			System.out.println("No Duplicates");

		sc.close();
	}
}
