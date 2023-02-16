package recursion2;

public class PrintEncodings {

	public static void main(String[] args) {
		f("993","");
	}

	
	static char codes[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private static void f(String str,String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
		for (int i=0;i<str.length();i++) {
			
			String ros=str.substring(i+1);
			if(i<2) {
				
				String val=str.substring(0,i+1);
				int value=Integer.parseInt(val);
				
				if(value<=26) {
					char ch=codes[value-1];
					f(ros,ans+ch);
				}
				
			}
			
			
			
		}
	
	}

}
