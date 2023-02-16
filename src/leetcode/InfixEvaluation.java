package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Character> operators = new Stack<>();
		Stack<Integer> operands = new Stack<>();
		int flag=0;
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch)) {
				t=t+ch;
			}else {
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println(Integer.parseInt(t));
			return;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch==' ')
				continue;
			
			if (Character.isDigit(ch)) {
				operands.push(ch - '0');
			} else if (ch == '(') {
				operators.push(ch);
			} else if (ch == ')') {

				while (operators.peek() != '(') {

					int val1 = operands.pop();
					int val2 = operands.pop();

					int ans = doOperation(val1, val2, operators.peek());

					operands.push(ans);

					operators.pop();

				}

				operators.pop();

			} else {
				if (operators.size() > 0 && (precedence(ch) <= precedence(operators.peek()))) {
					int val1 = operands.pop();
					int val2 = operands.pop();

					int ans = doOperation(val1, val2, operators.peek());

					operands.push(ans);

					operators.pop();
					operators.push(ch);

				} else {
					operators.push(ch);
				}
			}
		}

		while (operators.size() > 0) {
			int val1 = operands.pop();
			int val2 = operands.pop();

			int ans = doOperation(val1, val2, operators.peek());

			operands.push(ans);

			operators.pop();

		}

		System.out.println(operands.peek());
	}

	private static int precedence(char ch) {
		
	    if(ch=='(')
	    	return 0;
		else if (ch == '/')
			return 2;
		else if (ch == '*')
			return 2;
		else if (ch == '+')
			return 1;
		else
			return 1;
	}

	private static int doOperation(int val1, int val2, Character ch) {
		if (ch == '+') {
			return val2 + val1;
		} else if (ch == '-') {
			return val2 - val1;
		} else if (ch == '*') {
			return val2 * val1;
		} else {
			return val2 / val1;
		}
	}

}
