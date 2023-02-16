import java.util.Scanner;

public class DPProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		cswvj(arr,0);

	}

	private static int cswvj(int[] arr, int idx) {
		
		if(idx==arr.length)
			return 1;
			
		int jumps=arr[idx];
		int count=0;
		
		for(int i=1;i<=jumps;i++) {
			count=count+cswvj(arr, idx+i);
		}
		return count;		
	}

}
