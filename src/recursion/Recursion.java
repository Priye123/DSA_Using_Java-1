package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// printDecreasing(n);
		// printIncreasing(n);
		// pid(n);
		// System.out.println(fact(n));
		// int base=sc.nextInt();
		// int power=sc.nextInt();
		// System.out.println(pow(base,power));
		// System.out.println(powLog(base,power));
		// pzz(n);
//		int no_of_disks=sc.nextInt();
//		int s=sc.nextInt();
//		int d=sc.nextInt();
//		int h=sc.nextInt();
//		toh(no_of_disks,s,d,h);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//
//		for (int i = 0; i < arr.length; i++)
//			arr[i] = sc.nextInt();

		// displayArr(arr, 0);
		// System.out.println(maxOfArray(arr, 0));
		// System.out.print(lastIndex(arr, 0, sc.nextInt()));
//		int x = sc.nextInt();
//		int[] iarr = allIndices(arr, x, 0, 0);
//
//		if (iarr.length == 0) {
//			System.out.println();
//			return;
//		}
//
//		for (int i = 0; i < iarr.length; i++) {
//			System.out.println(iarr[i]);
//		}
		// System.out.println(gss(sc.next()));
		// System.out.println(getKPC(sc.next()));
		// System.out.println(getStairPaths(sc.nextInt()));
		// System.out.println(getMazePaths(1, 1, sc.nextInt(), sc.nextInt()));
		// System.out.println(getMazePathsWithJumps(1, 1, 2, 2));
		// printSS(sc.next(), "");
		// printKPC(sc.next(), "");
		// printStairPaths(sc.nextInt(), "");
		// printMazePaths(1, 1, sc.nextInt(), sc.nextInt(), "");
		// printMazePathsWithJumps(1, 1, sc.nextInt(), sc.nextInt(), "");
		// System.out.println(getPermutation(sc.next()));
		// printPermutations(sc.next(),"");
		printEncodings(sc.next(), "");
	}

	static char[] map = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void printEncodings(String str, String ans1) {

		if(str.length()==0) {
			System.out.println(ans1);
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			String ans = str.substring(0, i + 1);
			if (!ans.startsWith("0")) {
				int n = Integer.parseInt(ans);

				if (n <= 26) {
					printEncodings(str.substring(1), ans1 + map[n - 1]);
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

	// static int l=0;
	private static ArrayList<String> getPermutation(String str) {

		if (str.length() == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}
		char ch = str.charAt(0);
		ArrayList<String> rans = getPermutation(str.substring(1));

		ArrayList<String> myans = new ArrayList<>();

		for (String s : rans) {
			for (int i = 0; i < s.length(); i++) {
				myans.add(str.substring(0, i) + ch + str.substring(i + 1));
			}
		}
		return myans;
	}

	public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String psf) {

		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		if (sr > dr || sc > dc)
			return;

		// horizontal moves
		for (int jump = 1; jump <= dc - sc; jump++) {
			printMazePathsWithJumps(sr, sc + jump, dr, dc, psf + "h" + jump);
		}

		// vertical moves
		for (int jump = 1; jump <= dr - sr; jump++) {
			printMazePathsWithJumps(sr + jump, sc, dr, dc, psf + "v" + jump);
		}

		for (int jump = 1; jump <= dc - sc && jump <= dr - sr; jump++) {
			printMazePathsWithJumps(sr + jump, sc + jump, dr, dc, psf + "d" + jump);
		}
	}

	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		if (sr > dr || sc > dc)
			return;

		printMazePaths(sr, sc + 1, dr, dc, psf + "h");
		printMazePaths(sr + 1, sc, dr, dc, psf + "v");
	}

	public static void printStairPaths(int n, String path) {

		if (n == 0) {
			System.out.println(path);
			return;
		}
		if (n < 0)
			return;
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
		String ros = str.substring(1);

		String s = codes[ch - '0'];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			printKPC(ros, asf + c);
		}
	}

	public static void printSS(String str, String ans) {

		if (str.length() == 0) {
			if (ans == "")
				System.out.println("Priye");
			else
				System.out.println(ans);
			return;
		}
		printSS(str.substring(1), ans + str.charAt(0));
		printSS(str.substring(1), ans + "");
	}

	public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		ArrayList<String> myans = new ArrayList<>();

		// horizontal moves
		for (int jump = 1; jump <= dc - sc; jump++) {
			ArrayList<String> rres = getMazePathsWithJumps(sr, sc + jump, dr, dc);
			for (String s : rres)
				myans.add("h" + jump + s);
		}

		// vertical moves
		for (int jump = 1; jump <= dr - sr; jump++) {
			ArrayList<String> rres = getMazePathsWithJumps(sr + jump, sc, dr, dc);
			for (String s : rres)
				myans.add("v" + jump + s);
		}

		// diagonal moves
		for (int jump = 1; jump <= dr - sr && jump <= dc - sc; jump++) {
			ArrayList<String> rres = getMazePathsWithJumps(sr + jump, sc + jump, dr, dc);
			for (String s : rres)
				myans.add("d" + jump + s);
		}

		return myans;
	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

		if (sr == dr && sc == dc) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}
		if (sr > dr || sc > dc) {
			return new ArrayList<>();
		}

		ArrayList<String> myans = new ArrayList<>();
		ArrayList<String> hpaths = getMazePaths(sr, sc + 1, dr, dc);

		for (String path : hpaths) {
			myans.add("h" + path);
		}

		ArrayList<String> vpaths = getMazePaths(sr + 1, sc, dr, dc);
		for (String path : vpaths) {
			myans.add("v" + path);
		}

		return myans;
	}

	public static ArrayList<String> getStairPaths(int n) {
		if (n == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		if (n < 0) {
			return new ArrayList<>();
		}

		// ArrayList<String> rres;
		ArrayList<String> myans = new ArrayList<>();
		;

		for (int jump = 1; jump <= 3; jump++) {
			ArrayList<String> rres = getStairPaths(n - jump);
			for (String s : rres)
				myans.add(jump + s);
		}
		return myans;
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> kpc = getKPC(ros);

		ArrayList<String> myans = new ArrayList<>();

		String s = codes[ch - '0']; // codes[1]="abc"

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			for (String s1 : kpc) {
				myans.add(ch1 + s1);
			}
		}
		return myans;
	}

	public static ArrayList<String> gss(String str) {
		if (str.length() == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> b = gss(ros);
		ArrayList<String> myans = new ArrayList<>();

		for (String c : b)
			myans.add("" + c);

		for (String c : b)
			myans.add(ch + c);

		return myans;
	}

	// public static int a[];
	public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
		if (idx == arr.length) {
			// a=new int[fsf];
			return new int[fsf];
		}

		if (arr[idx] == x) {
			int a[] = allIndices(arr, x, idx + 1, fsf + 1);
			a[fsf] = idx;
			return a;
		} else {
			int a[] = allIndices(arr, x, idx + 1, fsf);
			return a;
		}
	}

	public static int lastIndex(int[] arr, int idx, int x) {
		if (idx == arr.length)
			return -1;

		int li = lastIndex(arr, idx + 1, x);
		if (arr[idx] == x && li == -1) {
			return idx;
		} else {
			return li;
		}
	}

	public static int firstIndex(int[] arr, int idx, int x) {
		if (idx == arr.length)
			return -1;

		if (arr[idx] == x) {
			return idx;
		}
		int n = firstIndex(arr, idx + 1, x);
		return n;
	}

	public static int maxOfArray(int[] arr, int idx) {
		if (idx == arr.length)
			return Integer.MIN_VALUE;
		int n = maxOfArray(arr, idx + 1);
		if (arr[idx] > n)
			n = arr[idx];

		return n;
	}

	public static void displayArr(int[] arr, int idx) {
		if (idx == arr.length)
			return;

		displayArr(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	private static void toh(int no_of_disks, int s, int d, int h) {

		if (no_of_disks == 0)
			return;

		toh(no_of_disks - 1, s, h, d);
		System.out.println(no_of_disks + "[" + s + "->" + d + "]");
		toh(no_of_disks - 1, h, d, s);

	}

	private static void pzz(int n) {
		if (n == 0)
			return;
		System.out.print(n + " ");
		pzz(n - 1);
		System.out.print(n + " ");
		pzz(n - 1);
		System.out.print(n + " ");
	}

	private static int powLog(int base, int power) {

		if (power == 0)
			return 1;
		int x = powLog(base, power / 2);
		if (power % 2 == 0) {
			return x * x;
		} else {
			return base * x * x;
		}
	}

	private static int pow(int base, int power) {
		if (power == 0)
			return 1;
		return base * pow(base, power - 1);
	}

	private static int fact(int n) {
		if (n == 0)
			return 1;
		int f = n * fact(n - 1);
		return f;
	}

	private static void pid(int n) {
		if (n == 0)
			return;
		// Expectation meets Faith
		System.out.println(n); // self-work
		pid(n - 1); // Faith
		System.out.println(n); // self-work
	}

	private static void printDecreasing(int n) {

		if (n == 0)
			return;
		System.out.println(n);
		printDecreasing(n - 1);
	}

	public static void printIncreasing(int n) {

		if (n == 0)
			return;
		printDecreasing(n - 1);
		System.out.println(n);
	}

}

// Sameer is a class & Priye is an inteface & Siree is an interface & X is a class
// public Siree extends Priye --valid   
//public Sameer implements X --invalid
//public X implements Siree --valid
