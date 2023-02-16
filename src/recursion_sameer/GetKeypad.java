package recursion_sameer;

import java.util.ArrayList;

public class GetKeypad {

	public static void main(String[] args) {
		System.out.println(f("573"));
	}

	static String[] keypad = { "?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".;" };

	private static ArrayList<String> f(String str) {

		if (str.length() == 0) {
			ArrayList<String> d = new ArrayList<>();
			d.add("");
			return d;
		}

		char ch = str.charAt(0);// 5
		ArrayList<String> a = f(str.substring(1));// Faith f(73)= [ug,vg,uh,vh,ui,vi]

		ArrayList<String> myans = new ArrayList<>();

		String code = keypad[ch-'0'];// keypad[5]="mnop"

		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);// m/n/o/p

			for (String s : a) {
				myans.add(c + s);
			}
		}
		return myans;
	}

}
