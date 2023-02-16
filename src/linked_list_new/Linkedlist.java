package linked_list_new;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(2, 13);
		l.set(1, 80);
		l.addFirst(50);
		l.addLast(60);
		l.remove();
	
		l.remove(l.size()-1);
		l.removeFirst();
		l.removeLast();
	
		for(int i:l)
			System.out.print(i+" ");

	}
}
