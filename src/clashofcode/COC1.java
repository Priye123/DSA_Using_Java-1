package clashofcode;

import java.util.Scanner;

class COC1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = in.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				char ch = s[i].charAt(j);
				if (ch != '#') {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}
