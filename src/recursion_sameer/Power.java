package recursion_sameer;

public class Power {

	public static void main(String[] args) {
		System.out.println(p(3,5));
	}

	private static int p(int x, int n) {
		
		if(n==0)
			return 1;
		
		int xnm1=p(x,n-1);
		int xn=xnm1*x;
		return xn;
		
	}

}
