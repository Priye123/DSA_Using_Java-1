package leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

class Pair implements Comparable<Pair> {
	int st;
	int et;

	Pair(int st, int et) {
		this.st = st;
		this.et = et;
	}

	@Override
	public int compareTo(Pair o) {
		if (this.st != o.st) {
			return this.st - o.st;
		} else {
			return this.et - o.et;
		}
	}
}

public class MergeOverlappingIntervals {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			String line = br.readLine();

			arr[i][0] = Integer.parseInt(line.split(" ")[0]);
			arr[i][1] = Integer.parseInt(line.split(" ")[1]);

		}
		mergeOverlappingIntervals(arr);
	}

	private static void mergeOverlappingIntervals(int[][] arr) {

		Pair p[] = new Pair[arr.length];

		for (int i = 0; i < arr.length; i++) {
			p[i] = new Pair(arr[i][0], arr[i][1]);
		}

		Arrays.sort(p);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(p[i].st + " " + p[i].et);
		}

		System.out.println("-------------------------------");

		Stack<Pair> st = new Stack<>();

		for (int i = 0; i < p.length; i++) {
			if (i == 0) {
				st.push(p[0]);
			} else {
				Pair top = st.peek();

				if (top.et >= p[i].st) {
					if (top.et < p[i].et) {
						top.et = p[i].et;
					}
				} else {
					st.push(p[i]);
				}
			}
		}

		Stack<Pair> st1 = new Stack<>();

		while (!st.empty()) {
			st1.push(st.pop());
		}

		while (!st1.empty()) {
			Pair p1 = st1.pop();
			System.out.println(p1.st + " " + p1.et);
		}

	}

}
