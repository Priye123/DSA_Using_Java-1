package recursion_sameer;

public class LastIndex {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 6, 9, 8, 3, 2, 3, 6, 4 };
		System.out.println(li(arr, 0, 3));
	}

	private static int li(int[] arr, int idx, int target) {

		if (idx == arr.length) {
			return -1;
		}

		int liisa = li(arr, idx + 1, target);// last index in smaller array

		if (liisa == -1) {

			if (arr[idx] == target) {
				return idx;
			} else {
				return -1;
			}
		} else {
			return liisa;
		}

	}

}
