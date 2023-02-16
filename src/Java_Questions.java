import java.util.Scanner;

public class Java_Questions {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s=sc.next();// a/b*c
		//String s="a/b*c";
		char c[]=s.toCharArray();
		reverse(c);
		
//		char c[]=s.toCharArray();
//		r(c);
		
//		for(int i=s.length()-1;i>=0;i--) {
//			if( (s.charAt(i)>='a'&& s.charAt(i)<='z') ) {
//				s1=s1+s.charAt(i); // C B A
//			}else {
//				
//			}
//		}
	}

	private static void reverse(char[] c) {
		
		char temp[]=new char[c.length];
		System.out.println(c.length);
		int x=0;
		
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a' && c[i]<='z') {
				temp[x]=c[i];
				x++;
			}
		}
		//System.out.println(temp[0]+" "+temp[1]+" "+temp[2]);
		//c :- reverse
		r(temp,0,x);
		//System.out.println(temp);
		
		x=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a' && c[i]<='z') {
				c[i]=temp[x];
				x++;
			}
		}
		String rev=new String(c);
		System.out.println(temp);
	
	}

	private static void r(char[] c, int left, int right) {
		
		for(int i=1;i<right/2;i++) {
			//current
			char temp=c[i];
			c[i]=c[right-left-i];
			c[right-left-i]=temp;
		}
	}

}
