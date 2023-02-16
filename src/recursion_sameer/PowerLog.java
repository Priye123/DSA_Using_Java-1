package recursion_sameer;

public class PowerLog {

	public static void main(String[] args) {
		System.out.println(p(2, 5));
	}

	private static int p(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int xnb2 = p(x, n / 2);
		int xn = xnb2 * xnb2;

		if (n % 2 != 0) {
			xn = xn * x;
		}
		return xn;
	}

}
