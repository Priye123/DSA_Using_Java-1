import java.util.Scanner;
import java.util.Stack;

//In a string, a "pair of characters" (or simply a "pair") is a set of two consecutive identical characters.
//
//Remove each pair of characters from the original string and replace it by a single instance of the repeated character.
//
//Note: there can be pairs in the resulting string because this process must not be repeated.
//For instance:
//aa (one pair) gives a but
//aaaa (two consecutive identical pairs) gives aa, although there is still a pair in the resulting string.
//aaa (one pair followed by a single identical character) also gives aa since only the pair is replaced, the single character being left unchanged, and once again the resulting string contains a pair.
//Input
//s the input string
//Output
//the resulting string with one character replacing each pair of characters from the original string
//Constraints
//Example
//Input
//HELLLO!
//Output
//HELLO!

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = "";
		Stack<Character> st = new Stack<>();
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch != s.charAt(i + 1) || count == 1) {
				st.push(ch);
				count = 0;
			} else {
				count++;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (st.size() != 0)
				t = st.pop()+t;
		}
		System.out.println(t);
	}

}
