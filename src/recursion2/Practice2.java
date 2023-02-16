package recursion2;

public class Practice2 {

	public static void main(String[] args) {
		f("pep", "", 0);
	}

	private static void f(String str, String ans, int count) {

		if (str.length() == 0) {
			if (count == 0) {
				System.out.println(ans);
			} else {
				System.out.println(ans + count);
			}
			return;
		}

		if (count == 0) {
			f(str.substring(1), ans + str.charAt(0), count);// yes call
		} else {
			f(str.substring(1), ans + count + str.charAt(0), 0);// yes call
		}

		f(str.substring(1), ans, count + 1);// no call
	}

}
