package recursion_sameer;

public class PrintSubsequence {

	public static void main(String[] args) throws Exception {
		printSS("abc", "");
	    printKPC("678","");
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
	
	private static void printKPC(String str, String ans) {
		
		String ros=str.substring(1);
		char ch=str.charAt(0);
		String choices=codes[ch-'0'];
		
		for(int i=0;i<choices.length();i++) {
			
			printKPC(ros,ans+choices.charAt(i));
		}
		
	}

	public static void printSS(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		printSS(str.substring(1), ans + str.charAt(0));
		printSS(str.substring(1), ans + "");
	}

}
