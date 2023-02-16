package recursion_sameer;

public class DisplayArray {

	public static void main(String[] args) {
		//int arr[]= {10,30,5,55,6};
		//dis(arr,0);
		//disrev(arr,0);
		//System.out.println(m(arr,0));
		int arr[]= {2,3,9,8,7,6,4,12,7,3,8};
		System.out.println(fi(arr,0,8));

	}

	private static int fi(int[] arr, int idx, int target) {
		
		if(idx==arr.length) {
			return -1;
		}
		
		if(arr[idx]==target) {
			return idx;
		}else {
			int fiisa=fi(arr,idx+1,target);
			return fiisa;
		}
			
	}

	private static int m(int[] arr, int idx) {
		
		if(idx==arr.length) {
			return Integer.MIN_VALUE;
		}
		
		int misa=m(arr,idx+1);//faith
		
		if(misa>arr[idx]) {
			return misa;
		}else {
			return arr[idx];
		}		
		
	}

	private static void disrev(int[] arr, int idx) {
		if(idx==arr.length) {
			return;
		}
		
		disrev(arr, idx+1);
		System.out.println(arr[idx]);
	}

	private static void dis(int[] arr, int idx) {
		
		if(idx==arr.length) {
			return;
		}
		
		System.out.println(arr[idx]);
		dis(arr,idx+1);
	}

}
