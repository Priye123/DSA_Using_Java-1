import java.util.Scanner;

public class switchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long s;

		s = (long) Math.floor(Math.log10(n) + 1);
		k = k % s; // to deal with k values > nod
		if (k < 0) // to check if k is negative
		{
			k = k + s; // to accomodate -k cases
		}
		
		s=s-k;

		long m = (long) Math.pow(10, k);
		long x = n / m, y = n % m;

		long z = (long) Math.pow(10, s);

		long w = z * y + x;

		System.out.println(w);
	}
}
