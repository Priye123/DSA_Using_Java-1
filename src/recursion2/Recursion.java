package recursion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// pd(5);
		int arr[][] = new int[n][n];
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				arr[i][j]=0;
//			}
//		}
		// System.out.println(maximum(arr, 0));

		// int tar = sc.nextInt();

		// System.out.println(fi(arr,0,key));

//		System.out.println(li(arr,0,key));

		// System.out.println(ai(arr, 0, key));

//		int a[] = ai1(arr, 0, key, 0);
//		for (int i = 0; i < a.length; i++)
//			System.out.print(a[i] + " ");

		// String str = sc.next();

//		System.out.println(getSS(str));

		// System.out.println(getKPC(str));

//		int n = sc.nextInt();
//		System.out.println(getStairPaths(n));

//		int m = sc.nextInt();
//		int n = sc.nextInt();
		// System.out.println(getMazePaths(1, 1, m, n));
		// System.out.println(getMazePathsWithJumps(1, 1, m, n));

		// printSS(sc.next(), "");
		// printKPC(sc.next(), "");

		// printStairPaths(sc.nextInt(), "");

//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		printMazePaths(1, 1, m, n, "");
		// printMazePathsWithJumps(1, 1, m, n, "");
//		printPermutations(sc.next(), "");
		// printEncodings(sc.next(), "");
		// printTargetSumSubsets(arr, 0, "", 0, tar);
		printNQueens(arr, "", 0);
	}

	public static void printNQueens(int[][] chess, String qsf, int row) {
		
		if(row==chess.length) {
			System.out.println(qsf+".");
			return;
		}
		for(int col=0;col<chess[0].length;col++) {
			if(isQueenSafe(chess,row,col)) {
				chess[row][col]=1;
				printNQueens(chess, qsf+row+"-"+col+",", row+1);
				chess[row][col]=0;
			}
			
		}
	}

	private static boolean isQueenSafe(int[][] chess, int row, int col) {
		
		// ^
		// '
		// '
		for(int i=row;i>=0;i--) {
			if(chess[i][col]==1)
				return false;
		}
		
		//^
		// '
		//  '
		
		for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(chess[i][j]==1)
				return false;
		}
		
		//   ^
		//  '
		// '
				
		for(int i=row,j=col;i>=0 && j<=chess[0].length-1;i--,j++) {
			if(chess[i][j]==1)
				return false;
		}
	
		return true;
	}

	public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
		if (idx == arr.length) {
			if (sos == tar)
				System.out.println(set + ".");
			return;
		}
		printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
		printTargetSumSubsets(arr, idx + 1, set, sos, tar);
	}

	public static char intToChar(int a) {
		switch (a) {
		case 1: {
			return 'a';
		}
		case 2:
			return 'b';
		case 3:
			return 'c';
		case 4:
			return 'd';
		case 5:
			return 'e';
		case 6:
			return 'f';
		case 7:
			return 'g';
		case 8:
			return 'h';
		case 9:
			return 'i';
		case 10:
			return 'j';
		case 11:
			return 'k';
		case 12:
			return 'l';
		case 13:
			return 'm';
		case 14:
			return 'n';
		case 15:
			return 'o';
		case 16:
			return 'p';
		case 17:
			return 'q';
		case 18:
			return 'r';
		case 19:
			return 's';
		case 20:
			return 't';
		case 21:
			return 'u';
		case 22:
			return 'v';
		case 23:
			return 'w';
		case 24:
			return 'x';
		case 25:
			return 'y';
		default:
			return 'z';

		}
		// return 0;
	}

	public static void printEncodings(String str, String asf) {

		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			if (i < 2) {
				String ros = str.substring(0, i + 1);
				if (ros.startsWith("0")) {
					return;
				}
				int a = Integer.parseInt(ros);
				if (a > 26) {
					return;
				} else {
					String ques = str.substring(i + 1);
					printEncodings(ques, asf + intToChar(a));
				}
			}

		}

	}

	public static void printPermutations(String str, String asf) {

		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutations(ros, asf + ch);
		}
	}

	public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String psf) {

		if (sr > dr || sc > dc) {
			return;
		}

		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		for (int ms = 1; ms <= dc - sc; ms++) {
			printMazePathsWithJumps(sr, sc + ms, dr, dc, psf + "h" + ms);
		}

		for (int ms = 1; ms <= dr - sr; ms++) {
			printMazePathsWithJumps(sr + ms, sc, dr, dc, psf + "v" + ms);
		}

		for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
			printMazePathsWithJumps(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
		}
	}

	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

		if (sr > dr || sc > dc) {
			return;
		}

		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		printMazePaths(sr, sc + 1, dr, dc, psf + "h");
		printMazePaths(sr + 1, sc, dr, dc, psf + "v");
	}

	public static void printStairPaths(int n, String path) {
		if (n < 0) {
			return;
		}

		if (n == 0) {
			System.out.println(path);
			return;
		}

		printStairPaths(n - 1, path + 1);
		printStairPaths(n - 2, path + 2);
		printStairPaths(n - 3, path + 3);
	}

	public static void printKPC(String str, String asf) {

		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = str.charAt(0);
		str = str.substring(1);

		String s = codes[ch - '0'];

		for (int i = 0; i < s.length(); i++) {
			char option = s.charAt(i);

			printKPC(str, asf + option);
		}
	}

	public static void printSS(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		str = str.substring(1);

		printSS(str, ans + "");
		printSS(str, ans + ch);

	}

	public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {

		if (sr == dr && sc == dc) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		ArrayList<String> paths = new ArrayList<>();

		for (int ms = 1; ms <= dc - sc; ms++) {
			ArrayList<String> hpaths = getMazePathsWithJumps(sr, sc + ms, dr, dc);

			for (String s : hpaths) {
				paths.add("h" + ms + s);
			}
		}

		for (int ms = 1; ms <= dr - sr; ms++) {
			ArrayList<String> vpaths = getMazePathsWithJumps(sr + ms, sc, dr, dc);

			for (String s : vpaths) {
				paths.add("v" + ms + s);
			}
		}

		for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
			ArrayList<String> dpaths = getMazePathsWithJumps(sr + ms, sc + ms, dr, dc);

			for (String s : dpaths) {
				paths.add("d" + ms + s);
			}
		}

		return paths;

	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

		if (sr > dr || sc > dc) {
			return new ArrayList<>();
		}

		if (sr == dr && sc == dc) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		ArrayList<String> hpaths = getMazePaths(sr, sc + 1, dr, dc);
		ArrayList<String> vpaths = getMazePaths(sr + 1, sc, dr, dc);

		ArrayList<String> paths = new ArrayList<>();

		for (String path : hpaths) {
			paths.add("h" + path);
		}

		for (String path : vpaths) {
			paths.add("v" + path);
		}

		return paths;
	}

	public static ArrayList<String> getStairPaths(int n) {

		if (n < 0) {
			return new ArrayList<>();
		}

		if (n == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		ArrayList<String> path1 = getStairPaths(n - 1);
		ArrayList<String> path2 = getStairPaths(n - 2);
		ArrayList<String> path3 = getStairPaths(n - 3);

		ArrayList<String> paths = new ArrayList<>();

		for (String path : path1) {
			paths.add(1 + path);
		}

		for (String path : path2) {
			paths.add(2 + path);
		}

		for (String path : path3) {
			paths.add(3 + path);
		}

		return paths;
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	private static ArrayList<String> getKPC(String str) {

		if (str.length() == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		char ch = str.charAt(0);
		str = str.substring(1);

		ArrayList<String> rres = getKPC(str);
		ArrayList<String> myans = new ArrayList<>();

		String s = codes[ch - '0'];

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			for (String s1 : rres) {
				myans.add(ch1 + s1);
			}
		}

		return myans;
	}

	private static ArrayList<String> getSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			System.out.println(a.size());
			return a;
		}

		char ch = str.charAt(0);
		str = str.substring(1);
		ArrayList<String> rres = getSS(str);
		ArrayList<String> myans = new ArrayList<>();

		for (String s : rres) {
			myans.add("" + s);
		}

		for (String s : rres) {
			myans.add(ch + s);
		}

		return myans;

	}

	private static int[] ai1(int[] arr, int idx, int key, int count) {

		if (idx == arr.length) {
			System.out.println(count);
			return new int[count];
		}

		if (arr[idx] == key) {
			int values[] = ai1(arr, idx + 1, key, count + 1);
			values[count] = idx;
			return values;
		} else {
			int values[] = ai1(arr, idx + 1, key, count);
			return values;
		}

	}

	private static ArrayList<Integer> ai(int[] arr, int idx, int key) {

		if (idx == arr.length) {
			return new ArrayList<Integer>();
		}

		ArrayList<Integer> values = ai(arr, idx + 1, key);

		if (arr[idx] == key) {
			values.add(idx);
			return values;
		} else {
			return values;
		}
	}

	private static int li(int[] arr, int idx, int key) {
		if (idx == arr.length) {
			return -1;
		}

		int val = li(arr, idx + 1, key);
		if (val == -1) {
			if (arr[idx] == key) {
				return idx;
			}
			return val;
		} else {
			return val;
		}

	}

	private static int fi(int[] arr, int idx, int key) {
		if (idx == arr.length) {
			return -1;
		}

		if (arr[idx] == key) {
			return idx;
		}

		int m = fi(arr, idx + 1, key);
		return m;

	}

	private static int maximum(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			int max = arr[idx];
			return max;
		}

		int m = maximum(arr, idx + 1);
		if (m > arr[idx]) {
			return m;
		} else {
			return arr[idx];
		}

	}

	private static void pd(int i) {

		if (i == 1) {
			System.out.println(i);
			return;
		}

		System.out.println(i);
		pd(i - 1);

	}

//	private static void pd(int n) {
//		System.out.println(n);
//		pd1(4);
//	}
//
//	private static void pd1(int n) {
//		System.out.println(n);
//		pd2(3);
//	}
//
//	private static void pd2(int i) {
//		System.out.println(i);
//		pd3(2);
//	}
//
//	private static void pd3(int i) {
//		System.out.println(i);
//		pd4(1);
//	}
//
//	private static void pd4(int i) {
//		System.out.println(i);
//		return;
//	}

}
