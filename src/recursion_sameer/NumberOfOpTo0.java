package recursion_sameer;

import java.util.Scanner;

public class NumberOfOpTo0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(f(num1, num2));
	}

	private static int f(int num1, int num2) {

		if (num1 == 0 || num2 == 0) {
			return 0;
		}
		if (num1 >= num2) {
			return f(num1 - num2, num2) + 1;
		} else {
			return f(num1, num2 - num1) + 1;
		}

	}

}
