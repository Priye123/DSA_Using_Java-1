import java.util.Scanner;

public class recursion_prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int data = sc.nextInt();
		int ar[] = fi(arr, 0, data, 0);

		for (int c : ar) {
			System.out.println(c);
		}
	}

	private static int[] fi(int[] arr, int i, int data, int fsf) {

		if (i == arr.length) {
			int ans[] = new int[0];
			return ans;
		}

		int s[] = fi(arr, i + 1, data, fsf);
		
		if (arr[i] == data) {
			int ans[] = new int[s.length + 1];
			ans[0] = i;
			
			for (int z = 0; z < s.length; z++) {
				ans[z + 1] = s[z];
			}
			return ans;
		}
		return s;

	}
}
