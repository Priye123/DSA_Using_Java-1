package recursion2;

import java.io.*;
import java.util.*;

public class GetKPC {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(getKPC(s));
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static ArrayList<String> getKPC(String str) {

		if (str.length() == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}

		char ch = str.charAt(0);// 6
		String ros = str.substring(1);// 78

		ArrayList<String> rres = getKPC(ros);// Faith

		ArrayList<String> mres = new ArrayList<>();
		String choices = codes[ch - '0'];// "pqrs"

		for (int i = 0; i < choices.length(); i++) {
			char c = choices.charAt(i);

			for (String r : rres) {
				mres.add(c + r);
			}
		}
		return mres;
	}

}
