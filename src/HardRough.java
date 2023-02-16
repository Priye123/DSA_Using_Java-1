import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class HardRough {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1[][] = new String[n][2];
		String s2[][] = new String[n][2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				s1[i][j] = sc.next();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				s2[i][j] = sc.next();
			}
		}
		int count = 0;
		ArrayList<String> a1 = new ArrayList<>();
		for (int i = 0; i < n; i++) {

			String a[] = s1[i][1].split(".");
			String b[] = s2[i][1].split(".");
			//System.out.println(a[0]);

			if (Integer.parseInt(a[0])!=Integer.parseInt(b[0])) {
				count++;
				a1.add(s1[i][0]);
			}

		}
		
		System.out.println(count);
		
		for(String f:a1) {
			System.out.println(f);
		}

	}
}

//Determine all packages that are out of date.
//Given are the number of packages. Followed by a list of installed versions and a list of available versions. Both lists contain the same number of packages in the same order.
//
//Note: The version is always three integers separated by dots.
//Input
//Line 1: An integer N for the number of packages.
//Next N lines: The name of a package and the installed version separated by space.
//Next N lines: The name of a package and the available version separated by space.
//Output
//Line 1: An integer K for the number of packages to update.
//Next K lines: The names of the packages which are out of date.
//Constraints
//1<=N<=100
//Package name is lowercase may contain numbers, multiple underscores and dashes. No spaces and special characters.
//The version is always three integers x.y.z separated by dots.
//0 <= x, y, z < 2^31
//Example
//Input
//4
//pip 18.3.1
//pytest 5.1.2
//scipy 1.7.1
//sympy 1.9.0
//pip 21.2.4
//pytest 6.2.4
//scipy 1.7.1
//sympy 1.9.0
//Output
//2
//pip
//pytest