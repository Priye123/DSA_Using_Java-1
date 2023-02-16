package recursion_sameer;

public class Printpattern {

	public static void main(String[] args) {
		f(4);
	}

	private static void f(int n) {

		if (n <= 0)
			return;

		System.out.println("Pre " + n);
		f(n - 1);
		System.out.println("In " + n);
		f(n - 2);
		System.out.println("Post " + n);

	}

}
