package recursion2;

import java.util.Scanner;

public class RecursionPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// sumOfdig(n, 0);
		// System.out.println(prodOfdig(n));
		// rev(n,"");
		int n1 = n;
		// System.out.println(palindrome(n, "", n1));
		//System.out.println(countOfzeros(n)==0?0:countOfzeros(n));
		int[] arr= {1,2,3,4,5};
		System.out.println(prod(arr,0));
	}

	private static int prod(int[] arr, int idx) {
		
		if(idx==arr.length) {
			return 1;
		}
		
		return arr[idx]*prod(arr,idx+1);
		
	}

	private static int countOfzeros(int n) {
		if (n == 0) {
			return 0;
		}
		if (n % 10 == 0) {
			return countOfzeros(n / 10) + 1;
		} else {
			return countOfzeros(n / 10) + 0;
		}
	}

	private static boolean palindrome(int n, String s, int n1) {
		if (n == 0) {
			int z = Integer.parseInt(s);
			if (z == n1) {
				return true;
			}
			return false;
		}

		return palindrome(n / 10, s + (n % 10), n1);

	}

	private static void rev(int n, String s) {
		if (n == 0) {
			System.out.println(s);
			return;
		}
		rev(n / 10, s + n % 10);
	}

	private static void sumOfdig(int n, int sum) {
		if (n == 0) {
			System.out.println(sum);
			return;
		}
		sumOfdig(n / 10, sum + n % 10);
	}

	private static int prodOfdig(int n) {
		if (n == 0) {
			return 1;
		}
		return prodOfdig(n / 10) * (n % 10);
	}

}
