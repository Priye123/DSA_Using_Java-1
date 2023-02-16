package recursion2;

import java.util.Scanner;

public class CodingPractices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();

		// System.out.println(stringLength(sc.next()));
		String s = sc.next();
		System.out.println(countConsonants(s));
		//System.out.println(countVowels(s));
//		char[] set = { 'a', 'b' };
//		String s = "";
//		for (char ch : set) {
//			s = s + ch;
//		}
//
//		System.out.println(s);
//		int k = 3;
//		printAllKLength(s, k);
	}

	private static int countVowels(String s) {

		if (s.length() == 0) {
			return 0;
		}
		if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o'
				|| s.charAt(0) == 'u') {
			return 1 + countVowels(s.substring(1));
		} else {
			// return countVowels(s.substring(1));
			return 0;
		}
	}

	private static int countConsonants(String s) {

		if (s.length() == 0) {
			return 0;
		}

		if (s.charAt(0) != 'a' && s.charAt(0) != 'e' && s.charAt(0) != 'i' && s.charAt(0) != 'o'
				&& s.charAt(0) != 'u') {
//			String ros = s.substring(1);
//			int c = countConsonants(ros);
//			return 1 + c;
			return 1 + countConsonants(s.substring(1));
		} else {
			return countConsonants(s.substring(1));
			//return 0;
		}
	}

	private static int stringLength(String s) {
//		if (s.length() == 0)
//			return 0;
//		return 1 + stringLength(s.substring(1));

		return (s.length() != 0) ? 1 + stringLength(s.substring(1)) : 0;
	}

}
