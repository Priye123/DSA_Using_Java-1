package recursion2;

public class CountStairsPaths {

	public static void main(String[] args) {
		System.out.println(f(3));
	}

	private static int f(int n) {

		if (n == 0) {
			return 1;
		}

		if (n < 0) {
			return 0;
		}

		int path = 0;

		path = path + f(n - 1);
		path = path + f(n - 2);
		path = path + f(n - 3);
		
		return path;

	}

}
