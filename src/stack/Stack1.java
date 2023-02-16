package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Scanner sc = new Scanner(System.in);
		// String s = sc.nextLine();

		// duplicateBrackets(s);
		// balancedBrackets(s);
//		balancedBrackets2(s);
//		ngetr();// rpa technique
		// ngetr_alt();
		// nsetr();
//		 nsetl();
//		ngetl();
		// stockSpan();
		// largestAreaHistogram();
		// slidingWindow();
		// celebrityProblem();
		// mergeOverlappingInterval();
		smallestNumberFollowingPattern();
	}

	private static void smallestNumberFollowingPattern() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Integer> st = new Stack<>();
		Map<Character, Integer> map = new LinkedHashMap<>();
		int count = 0, a = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'd') {
				a = map.containsKey(ch) ? map.get(ch) + 1 : 1;
				st.push(a);
			} else {
				System.out.print(a + 1);
				while (st.size() > 0) {
					System.out.print(st.pop());
				}
//				a = map.containsKey(ch) ? map.get(ch) + 1 : a;
//				System.out.print(a);
			}
		}
	}

	static class Interval {
		int st;
		int et;

		public Interval(int st, int et) {
			this.st = st;
			this.et = et;
		}
	}

	static class Custom_Comparator implements Comparator<Interval> {

		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.st - o2.st;// ascending order
		}
	}

	private static void mergeOverlappingInterval() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];

		for (int j = 0; j < n; j++) {
			String line = br.readLine();
			arr[j][0] = Integer.parseInt(line.split(" ")[0]);
			arr[j][1] = Integer.parseInt(line.split(" ")[1]);
		}
		Interval interval[] = new Interval[n];

		for (int j = 0; j < n; j++) {
			interval[j] = new Interval(arr[j][0], arr[j][1]);
		}

		Arrays.sort(interval, new Custom_Comparator());
		for (Interval e : interval) {
			System.out.println(e.st + " " + e.et);
		}

		Stack<Interval> st = new Stack<>();
		st.push(interval[0]);

		for (int i = 1; i < interval.length; i++) {
			Interval in = st.peek();
			if (in.et > interval[i].st) {
				if (in.et < interval[i].et) {
					in.et = interval[i].et;
				}
			} else {
				st.push(interval[i]);
			}
		}

		System.out.println("------------------------------------------------");
		while (!st.isEmpty()) {
			Interval in = st.peek();
			System.out.println(in.st + " " + in.et);
			st.pop();
		}

	}

	private static void celebrityProblem() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];

		for (int j = 0; j < n; j++) {
			String line = br.readLine();
			for (int k = 0; k < n; k++) {
				arr[j][k] = line.charAt(k) - '0';
			}
		}
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}

		while ((st.size() != 1)) {
			if (st.size() == 0) {
				break;
			}
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 0) {
				st.push(a);
			} else if (arr[b][a] == 0) {
				st.push(b);
			}
		}
		if (st.size() == 0) {
			System.out.println("No one is celebrity");
			return;
		} else {
			int c = st.peek();
			for (int i = 0; i < arr[0].length; i++) {
				if (arr[c][i] == 1) {
					System.out.println("No one is celebrity");
					return;
				}
			}
			System.out.println(c + " is a celebrity");
		}
	}

	private static void slidingWindow() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int k = sc.nextInt(), m, c;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < arr.length - k; i++) {
			m = k;
			c = i;
			while (m-- > 0) {
				pq.add(arr[c]);
				c++;
			}
			a.add(pq.peek());
			pq.clear();
		}

		for (int s : a) {
			System.out.println(s);
		}
	}

	private static void largestAreaHistogram() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		// we have to find left boundary of every element
		// nsetl
		Stack<Integer> st = new Stack<>();
		int lb[] = new int[n];
		st.push(0);
		lb[0] = -1;

		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if (st.size() == 0) {
				lb[i] = -1;
			} else {
				lb[i] = st.peek();
			}
			st.push(i);
		}

		// next smaller element to the right
		st.clear();
		st = new Stack<>();
		int rb[] = new int[n];
		st.push(arr.length - 1);
		rb[arr.length - 1] = arr.length;
		for (int i = n - 2; i >= 0; i--) {
			while (st.size() > 0 && arr[st.peek()] > arr[i]) {
				st.pop();
			}
			if (st.size() == 0) {
				rb[i] = arr.length;
			} else {
				rb[i] = st.peek();
			}
			st.push(i);
		}

		int totalboundary[] = new int[n];

		for (int i = 0; i < n; i++) {
			totalboundary[i] = Math.abs(lb[i] - rb[i]) - 1;
		}

		int maxArea = 0;
		for (int i = 0; i < arr.length; i++) {
			maxArea = Math.max(maxArea, totalboundary[i] * arr[i]);
		}

		System.out.println(maxArea);

	}

	private static void stockSpan() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<>();
		int span[] = new int[n];

		st.push(0);
		span[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[st.peek()] < arr[i]) {
				st.pop();
			}

			if (st.size() == 0) {
				span[i] = i + 1;
			} else {
				span[i] = i - st.peek();
			}
			st.push(i);
		}
	}

	private static void ngetl() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<>();
		int nge[] = new int[n];

		nge[0] = -1;
		st.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && st.peek() < arr[i]) {
				st.pop();
			}
			if (st.size() == 0) {
				nge[i] = -1;
			} else {
				nge[i] = st.peek();
			}
			st.push(arr[i]);
		}
		for (int x : nge) {
			System.out.println(x);
		}
	}

	private static void nsetl() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<>();
		int nge[] = new int[n];

		nge[0] = -1;
		st.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && st.peek() > arr[i]) {
				st.pop();
			}
			if (st.size() == 0) {
				nge[i] = -1;
			} else {
				nge[i] = st.peek();
			}
			st.push(arr[i]);
		}
		for (int x : nge) {
			System.out.println(x);
		}
	}

	private static void nsetr() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<>();
		int nge[] = new int[n];

		nge[n - 1] = -1;
		st.push(arr[n - 1]);

		for (int i = n - 2; i >= 0; i--) {
			while (st.size() > 0 && st.peek() > arr[i]) {
				st.pop();
			}
			if (st.size() == 0) {
				nge[i] = -1;
			} else {
				nge[i] = st.peek();
			}
			st.push(arr[i]);
		}

		for (int x : nge) {
			System.out.println(x);
		}
	}

	private static void ngetr_alt() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<>();
		int nge[] = new int[n];

//		st.push(arr[0]);
//		int pos=1;
//		for(int i=1;i<n;i++) {
//			while(st.size()>0 && st.peek()<arr[i]) {
//				st.pop();
//				nge[pos-1]=arr[i];
//				pos++;
//			}
//			st.push(arr[i]);
//		}

		st.push(0);
		for (int i = 1; i < n; i++) {
			while (st.size() > 0 && arr[i] > arr[st.peek()]) {
				nge[st.peek()] = arr[i];
				st.pop();
			}
			st.push(i);
		}
		while (st.size() > 0) {
			nge[st.peek()] = -1;
			st.pop();
		}
	}

	private static void ngetr() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<>();
		int nge[] = new int[n];

		nge[n - 1] = -1;
		st.push(arr[n - 1]);

		for (int i = n - 2; i >= 0; i--) {

			while (st.size() > 0 && arr[i] > st.peek()) {
				st.pop();
			}

			if (st.size() == 0) {
				nge[i] = -1;
			} else {
				nge[i] = st.peek();
			}
			st.push(arr[i]);
		}

	}

	private static void balancedBrackets2(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if (ch == ')') {
//				if(st.peek()!='(') { //mismatch bracket
//					System.out.println(false);
//					return;
//				}else if(st.size()==0) { //when closing brackets are more than open braces
//					System.out.println(false);
//					return;
//				}else {
//					st.pop();
//				}
				boolean val = handlingCloseBraces(st, '(');
				if (val == false) {
					System.out.println(false);
					return;
				}
			} else if (ch == '}') {
				boolean val = handlingCloseBraces(st, '{');
				if (val == false) {
					System.out.println(false);
					return;
				}
			} else if (ch == ']') {
				boolean val = handlingCloseBraces(st, '[');
				if (val == false) {
					System.out.println(false);
					return;
				}
			} else {

			}
		}
		if (st.size() == 0) {
			System.out.println(true);
		} else { // when open brackets are more than close braces
			System.out.println(false);
		}
	}

	public static boolean handlingCloseBraces(Stack<Character> st, char braces) {

		if (st.peek() != braces) { // mismatch bracket
			return false;
		} else if (st.size() == 0) { // when closing brackets are more than open braces
			return false;
		} else {
			st.pop();
			return true;
		}

	}

	private static void balancedBrackets(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(') {
				st.push(ch);
			} else if (ch == '{') {
				st.push(ch);
			} else if (ch == '[') {
				st.push(ch);
			} else {
				if (ch == '}' || ch == ')' || ch == ']') {
					if (st.size() > 0 && ch == ')' && st.peek() == '(')
						st.pop();
					else if (st.size() > 0 && ch == '}' && st.peek() == '{')
						st.pop();
					else if (st.size() > 0 && ch == ']' && st.peek() == '[')
						st.pop();
					else
						st.push(ch);
				}
			}
		}
		if (st.size() == 0) {
			System.out.println("Balanced");
		} else {
//			if (st.contains('('))
//				System.out.println("Not Balanced");
//			else if (st.contains('{'))
//				System.out.println("Not Balanced");
//			else if (st.contains('['))
//				System.out.println("Not Balanced");
//			else
			System.out.println("Not Balanced");
		}
	}

	private static void duplicateBrackets(String s) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch != ')') {
				st.push(ch);
			} else {
				if (st.peek() != '(') {
					while (st.peek() != '(') {
						st.pop();
					}
					st.pop();
				} else {
					System.out.println(true);
					return;
				}
			}
		}
		System.out.println(false);
	}

}
