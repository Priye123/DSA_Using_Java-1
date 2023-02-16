import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int n=sc.nextInt();
		System.out.println(s.length());
		String h="";
		int count=0;
		
//		testing, testing
//		3
//		tes-tin-g, -tes-tin-g
		
		//hint :- use 2 pointer approach
		
		for(int i=0;i<s.length()-n;i+=n) {
			
			for(int j=0;j<n;j++) {
				char ch=s.charAt(i+j);
				h=h+ch;
			}
			if(i<s.length()-n+1)
			 h=h+"-";
		}
		
		System.out.println(h+s.charAt(s.length()-1));

	}

}
