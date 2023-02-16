package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Rough{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		
		int k=sc.nextInt();
		
		System.out.println(splitArray(arr,k));
	}

	private static int splitArray(int[] arr, int k) {
		
		Arrays.sort(arr);
		int sum=0;
		for(int i:arr)
			sum=sum+i;
		
		int low=arr[0],high=sum,ans=-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(isPossible(arr,k,mid)) {
				high=mid-1;
				ans=mid;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}

	private static boolean isPossible(int[] arr, int k, int mid) {
		int persons=1;
		int pageSum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(pageSum+arr[i]<=mid) {
				pageSum=pageSum+arr[i];
			}else {
				persons++;
				if(persons>k || arr[i]>mid) {
					return false;
				}
				pageSum=arr[i];
			}
			if(persons>k) {
				
	            return false;
	        }
		}
		return true;
		
	}
}