package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaxinEachRow {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();

//		for (int i = 0; i < 5; i++) {
//			q.add(100 + i);
//		}
//		q.remove();
//		q.add(50);
//		int m = Integer.MIN_VALUE;
//		System.out.println(q);
//		for (int i = 0; i < q.size(); i++) {
//			int s = q.remove();
//			m = Math.max(m, s);
//			q.add(s);
//		}
//		System.out.println(m);
	
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		int s=q.remove();
		//q.remove();
		q.add(s);
		System.out.println(q);
	}

}
