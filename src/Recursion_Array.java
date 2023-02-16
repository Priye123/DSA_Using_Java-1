import java.util.Scanner;

//1.Write a Java program to read and print elements of array. - using recursion.
//public class Recursion_Array {
//
//	public static void main(String[] args) {
//		int arr[] = { 10, 5, 6, 12, 3 };
//		fun(arr,4);
//	}
//
//	private static void fun(int arr[], int n) {
//		if(n==-1) return;
//		fun(arr,n-1);
//		System.out.println(arr[n]);
//	}
//
//}

//2.Write a Java program to print all negative elements in an array.
//public class Recursion_Array {
//
//	public static void main(String[] args) {
//		int arr[] = { 10, -5, 6, -12, 3 };
//		fun(arr, 4);
//	}
//
//	private static void fun(int arr[], int n) {
//		if (n == -1)
//			return;
//		if (arr[n] < 0)
//			System.out.println(arr[n]);
//		fun(arr, n - 1);
//		
//	}
//
//}

//3. Write a Java program to find sum of all array elements. - using recursion.
//public class Recursion_Array {
//
//	public static void main(String[] args) {
//		int arr[] = { 10, 5, 6, 12, 3 };
//		System.out.println(fun(arr, 4));
//	}
//
//	private static int fun(int arr[], int n) {
//		if (n == -1)
//			return 0;
//		return fun(arr, n - 1)+arr[n];
//		
//	}
//}

//4.Display Array In Reverse
//public class Recursion_Array {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < arr.length; i++)
//			arr[i] = sc.nextInt();
//		displayArrReverse(arr,0);
//
//	}
//
//	public static void displayArrReverse(int[] arr, int idx) {
//		if(idx==arr.length)
//			return;
//		displayArrReverse(arr, idx+1);
//		System.out.println(arr[idx]);
//	}
//}

//5.Max Of An Array
public class Recursion_Array {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < arr.length; i++)
//			arr[i] = sc.nextInt();
//		int x = sc.nextInt();
//		System.out.println(lastIndex(arr, n - 1, x));
		int arr[] = { 44, 55, 44, 66, 55, 78 };
		System.out.println(lastIndex(arr, 5, 44));
	}

	public static int lastIndex(int[] arr, int idx, int x) {
		if (idx == arr.length)
			return -1;

		if (arr[idx] == x)
			return idx;
		else {
			int data = lastIndex(arr, idx - 1, x);
			return data;
		}

	}
}
