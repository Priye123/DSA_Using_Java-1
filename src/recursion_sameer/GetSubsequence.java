package recursion_sameer;

import java.util.ArrayList;

public class GetSubsequence {

	public static void main(String[] args) {
		ArrayList<String> ans = f("abcd");
		System.out.println(ans);

	}

	private static ArrayList<String> f(String str) {

		if (str.length() == 0) {
			ArrayList<String> d = new ArrayList<>();
			d.add("");
			return d;
		}

		char ch = str.charAt(0);// a

		ArrayList<String> a = f(str.substring(1));// [ "",c,b,bc]

		ArrayList<String> myans = new ArrayList<>();// []

		for (String s : a) {
			myans.add("" + s);// ["",c,b,bc]
			myans.add(ch + s);// [a,ac,ab,abc]
		}

		return myans;// ["",c,b,bc,a,ac,ab,abc]

	}

}
