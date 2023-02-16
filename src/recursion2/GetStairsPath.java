package recursion2;

import java.io.*;
import java.util.*;

public class GetStairsPath {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getStairPaths(n));
	}

	public static ArrayList<String> getStairPaths(int n) {

		if (n == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		if (n < 0) {
			ArrayList<String> a = new ArrayList<>();
			return a;
		}

		ArrayList<String> paths1 = getStairPaths(n - 1);
		ArrayList<String> paths2 = getStairPaths(n - 2);
		ArrayList<String> paths3 = getStairPaths(n - 3);

		ArrayList<String> mres = new ArrayList<>();

		for (String path : paths1) {
			mres.add(1 + path);
		}

		for (String path : paths2) {
			mres.add(2 + path);
		}

		for (String path : paths3) {
			mres.add(3 + path);
		}

		return mres;
	}

}
