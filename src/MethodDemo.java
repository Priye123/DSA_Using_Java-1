import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a[]=new int[n1];
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		
		int n2=sc.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		
		int sum[]=new int[n1>n2?n1:n2];
		int i=a.length-1;
		int j=b.length-1;
		int k=sum.length-1;
		
		//b.length=k+b.length;
		int d=0,c = 0;
		while(k>=0) {
			d=c;
			if(i>=0)
				d=d+a[i];
			if(j>=0)
				d=d+b[j];
			c=d/10;
			d=d%10;
			sum[k]=d;
			
			
			i--;
			j--;
			k--;
		}
		if(c!=0)
			System.out.print(c);
		for (int l : sum) {
			System.out.print(l);
		}
		
	}

}
