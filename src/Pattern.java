import java.util.Scanner;

//Determine whether a string is a palindrome or not
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		
		if(palindrome(s)) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");
	}

	private static boolean palindrome(String s) {
		
		if(s.length()==0) {
			//System.out.println("It is Palindrome");
			return true;
		}
		char c1=s.charAt(0);
		char c2=s.charAt(s.length()-1);
		
		if(s.charAt(c1)==s.charAt(c2)) {
			palindrome(s.substring(1,s.length()-1));
		}
		return false;
	}

}
