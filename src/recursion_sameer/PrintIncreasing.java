package recursion_sameer;

public class PrintIncreasing {

	public static void main(String[] args) {
		f(5);
	}

	private static void f(int n) {
		
		if(n==0)
			return;
		
		f(n-1);
		System.out.println(n);
		
	}

}
