import java.util.Scanner;

public class aman {

	public static void main(String[] args) {
		/*Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		//int r=scn.nextInt();
		//comb(n,r);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				comb(i,j);
			}
			System.out.println();
		}
	}

	private static void comb(int n,int r) {
		int x=fact(n)/(fact(r)*fact(n-r));
		
		System.out.print(x+"\t");
	}

	private static int fact(int n) {
		int x=1;
		if(n==0)
			return 1;
		for(int i=1;i<=n;i++) {
			x=x*i;
		}
		return x;		
	}
*/
		
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		//int r=scn.nextInt();
		//comb(n,r);
		int iCj=1,iCj1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0)
					System.out.print("1\t");
				else
					System.out.print(iCj+"\t");
				iCj1=(iCj*(i-j))/(j+1);
				iCj=iCj1;			
			}
			System.out.println();
		}
}
}
