package recursion2;

public class PrintStair {

	public static void main(String[] args) {
		//s(3,"");
		perm("abc","");
	}

	private static void perm(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			String ros=str.substring(0,i)+str.substring(i+1);
			char ch=str.charAt(i);
			perm(ros,ans+ch);
		}
		
	}

	private static void s(int n,String ans) {
		
		if(n<0) {
			return;
		}
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		s(n-1,ans+1);
		s(n-2,ans+2);
		s(n-3,ans+3);
		
	}

}
