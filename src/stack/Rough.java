package stack;

import java.util.Stack;

public class Rough {

	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<5;i++) {
			st.push((char) ('a'+i));
		}
		System.out.println(st.contains('c'));
	}

}
