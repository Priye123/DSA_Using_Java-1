package recursion2;

public class TargetSumSubset {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30,40,50 };
		int target = 60;
		f(arr, 0, "", 0, target);
	}

	private static void f(int[] arr, int idx, String set, int sos, int target) {

		if (idx == arr.length) {
			if (sos == target) {
				System.out.println(set+".");
				return;
			}
			return;
		}

		f(arr, idx + 1, set + arr[idx]+" ", sos + arr[idx], target);
		f(arr, idx + 1, set, sos, target);

	}

}
