package recursion_sameer;

public class AllIndex {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 6, 9, 8, 3, 2, 3, 6, 4 };
		int a[] = allIndex(arr, 3, 0, 0);

		for (int x : a) {
			System.out.println(x);
		}
	}

	private static int[] allIndex(int[] arr, int target, int idx, int fsf) {

		if (idx == arr.length) {
			return new int[fsf];
		}

		if (arr[idx] == target) {
			int a[] = allIndex(arr, target, idx + 1, fsf + 1);
			a[fsf] = idx;
			return a;
		} else {
			int a[] = allIndex(arr, target, idx + 1, fsf);
			return a;
		}

	}

}
