import java.util.Scanner;
import java.util.Stack;

public class StackLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();//a/b*c
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				st.push(ch);//a b c
			}
		}
		//String e="";
		for(int i=0;i<s.length();i++) { // a/b*c
			char ch=s.charAt(i);//a
			if(ch>='a' && ch<='z') {
				System.out.print(st.pop());
			}else {
				System.out.print(ch);
			}
		}

	}

}
