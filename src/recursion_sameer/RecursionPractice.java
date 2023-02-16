package recursion_sameer;

import java.util.Scanner;

public class RecursionPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int originalNumber = n;
//
//		System.out.println(isArmStrongNumber(n, originalNumber, 0));
		String str = sc.next();
		//f(str, "");
		System.out.println(f(str));
	}

	private static String f(String str) {
		
		if(str.length()==0) {
			return "";
		}
		
		if(str.charAt(0)=='a') {
			return f(str.substring(1));
		}else {
			return str.charAt(0)+f(str.substring(1));
		}
		
	}

	private static void f(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		if (ch != 'a')
			f(ros, ans + ch);
		else
			f(ros, ans);

	}

	private static boolean isArmStrongNumber(int n, int originalNumber, int sum) {

		if (n == 0) {
			if (sum == originalNumber) {
				return true;
			} else {
				return false;
			}
		}

		boolean s = isArmStrongNumber(n / 10, originalNumber, sum + ((n % 10) * (n % 10) * (n % 10)));
		return s;
	}

}
