//Fred works in a warehouse handling boxes. Every box has a reference number (up to 7 digits) printed on it.
//
//Some numbers look like a different number if the box is upside-down.
//Example: 18609 ➠ 60981. Fred calls these NUISANCE numbers.
//
//Given a number, determine if it is a NUISANCE number (output yes or no).
//
//In the font used by the box printer:
//• an upside-down 0 looks like a 0
//• an upside-down 1 looks like a 1
//• an upside-down 6 looks like a 9
//• an upside-down 8 looks like a 8
//• an upside-down 9 looks like a 6
//
//A number which looks the same when upside-down (Example: 86098 ➠ 86098) is NOT a NUISANCE number.
//Input
//The number printed on the box, N
//Output
//yes if N is a NUISANCE number
//no if N is not a NUISANCE number
//Constraints
//N is an integer with no more than 7 digits
//Example
//Input
//6
//Output
//yes

package priority_queue;

import java.util.Scanner;

class Practice12 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int x = N;
		System.out.println(x);
		
		String t = "";
		while (x != 0) {
			int n = x % 10;
			if (n == 0 || n == 1 || n == 8) {
				t = t + n;
			} else if (n == 6) {
				t = t + "9";
			} else if (n == 9) {
				t = t + "6";
			}
			x /= 10;
		}

		int d = Integer.parseInt(t);
		System.out.println(d);
		if (d == N) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		in.close();
	}
}