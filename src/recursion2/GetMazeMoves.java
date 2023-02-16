package recursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazeMoves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getMazeMove(1, 1, n, n));
	}

	private static ArrayList<String> getMazeMove(int sr, int sc, int dr, int dc) {

		if (sr == dr && sc == dc) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		if (sr > dr || sc > dc) {
			ArrayList<String> a = new ArrayList<>();
			return a;
		}

		ArrayList<String> hmoves = getMazeMove(sr, sc + 1, dr, dc);
		ArrayList<String> vmoves = getMazeMove(sr + 1, sc, dr, dc);

		ArrayList<String> mres = new ArrayList<>();

		for (String move : hmoves) {
			mres.add("h" + move);
		}

		for (String move : vmoves) {
			mres.add("v" + move);
		}

		return mres;

	}

}
