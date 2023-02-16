package leetcode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PrintBracketNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		Stack<Integer> st=new Stack<>();
		int count=1;
		
		ArrayList<Integer> a=new ArrayList<>();
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch=='(') {
				st.push(count);
				a.add(count);
				count++;
			}else if(!st.empty() && ch==')') {
				a.add(st.peek());
				st.pop();
			}
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}
