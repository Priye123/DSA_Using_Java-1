package recursion;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		int[] iarr = allIndices(arr, x, 0, 0);
		for (int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}

	}

	public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
		
		if(idx==arr.length) {
			return new int[fsf];
		}
		
		if(arr[idx]==x) {
			int a[]=allIndices(arr, x, idx+1, fsf+1);
			a[fsf]=idx;
			return a;
		}else {
			int a[]=allIndices(arr, x, idx+1, fsf);
			return a;
		}
	}

}
