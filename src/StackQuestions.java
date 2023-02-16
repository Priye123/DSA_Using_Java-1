import java.util.HashMap;
import java.util.Scanner;

public class StackQuestions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 
			 if(hm.containsKey(ch)) {
				 int val=hm.get(ch);
				hm.put(ch, val+1);
				 
			 }else {
				 hm.put(ch, 1);
			 }		
		}
		
		for(Character c:hm.keySet()) {
			System.out.println(c + " "+hm.get(c));
		}
		 
	}

}
