package leetcode;
import java.util.ArrayList;
import java.util.Scanner;

public class LeetCode2259 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		char digit = sc.next().charAt(0);
		System.out.println(removeDigit(number, digit));
	}

	public static String removeDigit(String number, char digit) {
		StringBuilder sb = new StringBuilder(number);
		ArrayList<String> s = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		try {
			if (number.length() >= 2 && number.length() <= 100) {

				for (int i = 0; i < number.length(); i++) {
					if (number.charAt(i) == digit) {
						s.add(sb.deleteCharAt(i).toString());
						sb.insert(i, number.charAt(i));
					}
				}

				for (int i = 0; i < s.size(); i++) {
					if (s.get(i) != null)
						max = Math.max(Integer.parseInt(s.get(i)), max);
				}
			}
		} catch (NumberFormatException e) {
			System.exit(1);
		}
		return Integer.toString(max);
	}
}
