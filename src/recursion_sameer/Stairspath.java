package recursion_sameer;

import java.util.ArrayList;

public class Stairspath {

	public static void main(String[] args) {
		System.out.println(f(4));
	}

	private static ArrayList<String> f(int n) {

		if (n == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		if (n < 0) {
			ArrayList<String> b = new ArrayList<>();
			return b;
		}

		ArrayList<String> path1 = f(n - 1); // [21,111]
		ArrayList<String> path2 = f(n - 2);// [11,2]
		ArrayList<String> path3 = f(n - 3);// [1]

		ArrayList<String> paths = new ArrayList<>();

		for (String p : path1) {
			paths.add(1 + p);
		}

		for (String p : path2) {
			paths.add(2 + p);
		}

		for (String p : path3) {
			paths.add(3 + p);
		}

		return paths;
	}

}
