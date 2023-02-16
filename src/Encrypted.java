import java.util.Scanner;

public class Encrypted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt(),i;
		
		for(i=0;i<s.length()-n;i+=n) {
			System.out.print(s.substring(i,i+n)+"-");
		}
		
		if(s.length()!=0)
			System.out.print(s.substring(i));
		
	}

}
