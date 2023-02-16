package recursion2;

public class codes {

	public static void main(String[] args) {
		f("1*3", "");
		System.out.println(count);
	}

	static char codes[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static int count = 0, m = 0;
	public static char ch1 = '0';
	// public static char star[]= {'0','1','2','3','4','5','6','7','8','9'};

	private static void f(String str, String ans) {

		if (str.length() == 0) {
			count++;
			return;
		}

		if (m == 0) {
			for (char j = '0'; j < '9'; j++) {
				for (int i = 0; i < str.length(); i++) {

					str = str.replace('*', j);

					String ros = str.substring(i + 1);
					if (i < 2) {

						String val = str.substring(0, i + 1);
						if (val.startsWith("0")) {
							return;
						}
						int value = Integer.parseInt(val);

						if (value <= 52) {
							char ch = codes[value - 1];
							f(ros, ans + ch);
							
						}

					}

				}
			}
		} else {
			for (int i = 0; i < str.length(); i++) {

				str = str.replace('*', ch1);
				ch1 = (char) (ch1 + 1);

				String ros = str.substring(i + 1);
				if (i < 2) {

					String val = str.substring(0, i + 1);
					if (val.startsWith("0")) {
						return;
					}
					int value = Integer.parseInt(val);

					if (value <= 52) {
						char ch = codes[value - 1];
						f(ros, ans + ch);
					}

				}

			}
		}

	}

}
