package priority_queue;

import java.util.PriorityQueue;

public class KLargest {

	public static void main(String[] args) {
		int arr[]= {2,10,5,17,7,18,6,4};
		int k=3;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++)
			pq.add(arr[i]);
		
		for(int i=k;i<arr.length;i++) {
			if(pq.peek()<arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		System.out.println(pq);
	}

}
