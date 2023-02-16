package recursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class FloodFill {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		boolean[][] visited = new boolean[n][m];
		System.out.println(floodfill(arr, 0, 0, visited));
	}

	//private static ArrayList<String> a = new ArrayList<>();

	public static ArrayList<String> floodfill(int[][] maze, int sr, int sc, boolean[][] visited) {
		if (sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1
				|| visited[sr][sc] == true) {
			ArrayList<String> a = new ArrayList<>();
			return a;
		}
		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}
		visited[sr][sc] = true;
//		floodfill(maze, sr - 1, sc, asf + "t", visited);
//		floodfill(maze, sr, sc - 1, asf + "l", visited);
//		floodfill(maze, sr + 1, sc, asf + "d", visited);
//		floodfill(maze, sr, sc + 1, asf + "r", visited);
		ArrayList<String> s1 = floodfill(maze, sr - 1, sc, visited);
		ArrayList<String> s2 = floodfill(maze, sr, sc - 1, visited);
		ArrayList<String> s3 = floodfill(maze, sr + 1, sc, visited);
		ArrayList<String> s4 = floodfill(maze, sr, sc + 1, visited);

		ArrayList<String> myresult = new ArrayList<>();

		for (String s : s1) {
			myresult.add("t" + s);
		}

		for (String s : s2) {
			myresult.add("l" + s);
		}

		for (String s : s3) {
			myresult.add("d" + s);
		}

		for (String s : s4) {
			myresult.add("r" + s);
		}

		visited[sr][sc] = false;

		return myresult;

	}
}
