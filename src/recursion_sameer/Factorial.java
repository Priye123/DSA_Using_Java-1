package recursion_sameer;

public class Factorial {

	public static void main(String[] args) {
		int r=fact(5);
		System.out.println(r);
	}

	private static int fact(int n) {
		
		if(n==0)
			return 1;
		
		int f1=fact(n-1);
		int f2=n*f1;
		return f2;
	}

}
