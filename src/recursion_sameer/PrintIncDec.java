package recursion_sameer;

public class PrintIncDec {

	public static void main(String[] args) {
		f(4);
	}

	private static void f(int n) {

		if (n == 0)
			return;

		System.out.println(n);
		f(n - 1);
		System.out.println(n);
	}

}
