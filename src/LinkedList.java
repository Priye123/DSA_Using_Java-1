import java.util.Scanner;

class Node{
	int data;
	Node next;
}

public class LinkedList {
	
	Node head;
	//Node tail;
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Node head=l.createNode();
		l.display(head);
		l.addLast(head);
		l.addLast(head);
		l.addLast(head);
		l.addLast(head);
		l.addLast(head);
		l.display(head);
		l.addLast(head);
		l.addLast(head);
		l.addLast(head);
		l.display(head);
	}

	private void addLast(Node head) {
		Node z=new Node();
		System.out.print("Enter the next node::");
		Scanner sc=new Scanner(System.in);
		z.data=sc.nextInt();
		z.next=null;
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=z;
	}

	private void display(Node temp) {
		Node z=temp;
		while(z!=null) {
			System.out.println(z.data);
			z=z.next;
		}		
	}

	private Node createNode() {
		Node t=new Node();
		System.out.print("Enter the first node::");
		Scanner sc=new Scanner(System.in);
		t.data=sc.nextInt();
		t.next=null;
		head=t;
		return head;
	}

}
