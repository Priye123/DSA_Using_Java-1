import java.util.ArrayList;
import java.util.Scanner;

public class SumProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no_of_digits = sc.nextInt();
		int sum = sc.nextInt();

		int end = (int) Math.pow(10, no_of_digits) - 1;
		int start = (int) Math.pow(10, no_of_digits - 1);
		ArrayList<Integer> al = new ArrayList<>();

		while (start <= end) {
			int i = start;
			int s = 0, m = i;

			while (m != 0) {
				s = s + m % 10;
				m = m / 10;
			}
			if (s == sum) {
				al.add(i);
				start += 9;
			} else
				start++;
		}
		System.out.println(al);
	}

}
