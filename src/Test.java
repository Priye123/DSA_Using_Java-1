import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array-1::");
		int s1 = sc.nextInt();
		int arr1[] = new int[s1];
		System.out.println("Enter elements of Array-1::");
		for (int i = 0; i < s1; i++)
			arr1[i] = sc.nextInt();
		System.out.println("Enter size of Array-2::");
		int s2 = sc.nextInt();
		int arr2[] = new int[s2];
		System.out.println("Enter elements of Array-1::");
		for (int i = 0; i < s2; i++)
			arr2[i] = sc.nextInt();
		int s = arr1.length + arr2.length;
		merge(arr1, arr2, s);
	}

	private static void merge(int[] arr1, int[] arr2, int s) {
		int arr3[] = new int[s];
		int x = 0, y = 0, i = 0;

		for (i = 0; i < s && x != arr1.length && y != arr2.length; i++) {

			if (arr1[x] > arr2[y]) {
				arr3[i] = arr1[x];
				x++;
			} else {
				arr3[i] = arr2[y];
				y++;
			}
		}
		int pos = i;
		if (x != arr1.length) {
			for (int k = x; k < arr1.length; k++) {
				arr3[pos] = arr1[k];
				pos++;
			}
		}

		if (y != arr2.length) {
			for (int k = y; k < arr2.length; k++) {
				arr3[pos] = arr2[k];
				pos++;
			}
		}

		System.out.println("The sorted elements after merging array are::");

		for (int z = 0; z < s; z++)
			System.out.print(arr3[z]+" ");
	}
}