package recursion2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,40);
		list.set(3,15);
		
		System.out.println(list+ "->"+list.size());
	}

}
