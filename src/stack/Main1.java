package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1 {

	public static class TwoStack {
		int[] data;
		int tos1;
		int tos2;
		Stack<Integer> st1;
		Stack<Integer> st2;

		public TwoStack(int cap) {
			data = new int[cap];
			tos1 = -1;
			tos2 = -1;
			st1 = new Stack<>();
			st2 = new Stack<>();
		}

		int size1() {
			return st1.size();
		}

		int size2() {
			return st2.size();
		}

		void push1(int val) {
			tos1++;
			if (st1.size() < data.length - 1)
				st1.push(val);
		}

		void push2(int val) {
			tos2++;
			if (st2.size() < data.length - 1)
				st2.push(val);
		}

		int pop1() {
			return st1.pop();
		}

		int pop2() {
			return st2.pop();
		}

		int top1() {
			return st1.peek();
		}

		int top2() {
			return st2.peek();
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		TwoStack st = new TwoStack(n);

		String str = br.readLine();
		while (str.equals("quit") == false) {
			if (str.startsWith("push1")) {
				int val = Integer.parseInt(str.split(" ")[1]);
				st.push1(val);
			} else if (str.startsWith("pop1")) {
				int val = st.pop1();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("top1")) {
				int val = st.top1();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("size1")) {
				System.out.println(st.size1());
			} else if (str.startsWith("push2")) {
				int val = Integer.parseInt(str.split(" ")[1]);
				st.push2(val);
			} else if (str.startsWith("pop2")) {
				int val = st.pop2();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("top2")) {
				int val = st.top2();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("size2")) {
				System.out.println(st.size2());
			}
			str = br.readLine();
		}
	}
}