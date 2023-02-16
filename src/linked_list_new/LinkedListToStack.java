package linked_list_new;

class Node1{
	int data;
	Node1 next;
}


public class LinkedListToStack {
	
	Node1 head;
	Node1 tail;
	int size;

	public static void main(String[] args) {
		LinkedListToStack l=new LinkedListToStack();
		l.removeFirst();
		l.push(20);
		l.push(60);
		l.push(70);
		l.peek();
		l.push(80);
		l.peek();
		l.pop();
		l.peek();
		l.size();
	}

	public void size() {
		System.out.println("The size of stack is::"+size);
	}

	public void pop() {
		removeFirst();
	}

	public void removeFirst() {
		if(size==0) {
			System.out.println("unable to delete..size is 0");
		}else {
		Node1 temp=head;
		head=head.next;
		temp.next=null;	
		size--;
		}
	}

	public void peek() {
		System.out.println("The top element is::"+head.data);
	}

	public void push(int i) {
		addFirst(i);
	}
	
	public void addFirst(int i) {
		Node1 temp=new Node1();
		temp.data=i;
		if(size==0) {
			head=tail=temp;
			temp.next=null;
			size++;
		}else {
			temp.next=head;
			head=temp;
			size++;
		}
	}

}
