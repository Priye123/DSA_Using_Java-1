package leetcode;

import java.util.Scanner;

//001
//011
//ans:-001
class Rough1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String n1 = in.nextLine();
		String n2 = in.nextLine();

		String ans = "";

		for (int i = 0; i < n1.length(); i++) {

			if (n1.charAt(i) == '0' && n2.charAt(i) == '0') {
				ans += '0';
			} else if (n1.charAt(i) == '0' && n2.charAt(i) == '1') {
				ans += '0';
			} else if (n1.charAt(i) == '1' && n2.charAt(i) == '0') {
				ans += '0';
			} else if (n1.charAt(i) == '1' && n2.charAt(i) == '1') {
				ans += '1';
			}
		}

		System.out.println(ans);

	}
}
