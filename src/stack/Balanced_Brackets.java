package stack;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Character> st = new Stack<>();
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			count=0;
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else {
				if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
					st.pop();
					count++;
				}
					
				else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
					st.pop();
					count++;
				}
				else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
					st.pop();
					count++;
				}
			
				if(count==0 && (ch==')' || ch==']' || ch=='}') ) {
					System.out.println("Not Balanced");
					return;
				}
			}
		}
		if (st.size() == 0) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}

	}

}
