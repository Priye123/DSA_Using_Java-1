package linked_list_new;

import java.util.Scanner;

class Node {
	int data;
	Node next;
}

public class CustomLinkedList {

	Node head;
	Node tail;
	int size;

	public static void main(String[] args) {
		CustomLinkedList c = new CustomLinkedList();
		c.addNode(10);
		c.addNode(20);
		c.size();
		c.display();
		c.addFirst(40);
		c.display();
		c.addNode(50);
		c.addFirst(80);
		c.display();
		c.addLast(13);
		c.addNode(14);
		c.addFirst(15);
		c.addLast(16);
		c.addLast(17);
		c.addNode(18);
		c.addFirst(20);
		c.size();
		c.display();
		c.addatIndex(5, 76);
		// c.addatIndex(0,69);
		c.display();
		c.size();
		c.removeFirst();
		c.display();
		c.size();
		c.removeLast();
		c.removeLast();
		c.display();
		c.size();
		// c.addFirst(45);
		// c.addLast(678);
		c.getFirst();
		c.addatIndex(4, 197);
		c.display();
		// c.getLast();
		// c.getAtIndex(7);
		c.removeAtIndex(4);
		c.removeAtIndex(0);
		// c.display();
		c.reverse();
		c.getFirst();
		c.display();
		c.reverse1();
		c.getFirst();
		c.display();
		c.kthNodeFromEnd(4);
		c.addatIndex(4, 58);
		c.addLast(34);
		c.display();
		c.middleNode();
//		c.mergeTwoSortedList();
//		c.display();
		// c.removeDuplicates();
		// c.display();
//		c.oddEven();
//		c.display();
		c.kReverse();
	}

	public void kReverse() {
		Scanner sc = new Scanner(System.in);
		CustomLinkedList l = new CustomLinkedList();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++)
			l.addNode(sc.nextInt());

		int k = sc.nextInt();

		CustomLinkedList p = null;
		Node f = l.head;

		while (f != null) {
			CustomLinkedList curr = new CustomLinkedList();
			for (int i = 1; i <= k; i++) {
				curr.addFirst(f.data);
				f = f.next;
			}
			if (p == null) {
				p = curr;
			} else {
				p.tail.next = curr.head;
			}
		}

	}

	public void oddEven() {
		Scanner sc = new Scanner(System.in);
		CustomLinkedList l = new CustomLinkedList();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++)
			l.addNode(sc.nextInt());

		CustomLinkedList even = new CustomLinkedList();
		CustomLinkedList odd = new CustomLinkedList();

		Node f = l.head;

		while (f != null) {
			if (f.data % 2 != 0) {
				odd.addNode(f.data);
			} else {
				even.addNode(f.data);
			}
			f = f.next;
		}
		odd.tail.next = even.head;
		this.head = odd.head;

	}

	public void removeDuplicates() {
		Scanner sc = new Scanner(System.in);
		CustomLinkedList l = new CustomLinkedList();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++)
			l.addNode(sc.nextInt());

		Node f = l.head;
		CustomLinkedList l1 = new CustomLinkedList();

		while (f.next != null) {
			if (f.data != f.next.data)
				l1.addNode(f.data);
			f = f.next;
		}
		l1.addNode(f.data);
		head = l1.head;
	}

	public void mergeTwoSortedList() {
		Scanner sc = new Scanner(System.in);
		CustomLinkedList l1 = new CustomLinkedList();
		CustomLinkedList l2 = new CustomLinkedList();

		int n1 = sc.nextInt();
		for (int i = 0; i < n1; i++)
			l1.addNode(sc.nextInt());

		int n2 = sc.nextInt();
		for (int i = 0; i < n2; i++)
			l2.addNode(sc.nextInt());

		Node f = l1.head;
		Node t = l2.head;

		CustomLinkedList l3 = new CustomLinkedList();

		while (f != null && t != null) {
			if (f.data > t.data) {
				l3.addNode(t.data);
				t = t.next;
			} else {
				l3.addNode(f.data);
				f = f.next;
			}
		}

		while (f != null) {
			l3.addNode(f.data);
			f = f.next;
		}

		while (t != null) {
			l3.addNode(t.data);
			t = t.next;
		}

		this.head = l3.head;
	}

	private void middleNode() {
		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.println("The middle node is::" + slow.data);
	}

	public void kthNodeFromEnd(int k) {
		Node f = head;
		Node t = head;

		for (int i = 1; i <= k; i++)
			t = t.next;

		while (t.next != null) {
			f = f.next;
			t = t.next;
		}
		Node temp = f.next;
		f.next = f.next.next;
		temp.next = null;
	}

	public void reverse1() {
		Node p = null;
		Node c = head;

		while (c != null) {
			Node t = c.next;
			c.next = p;
			p = c;
			c = t;
		}
		Node temp = head;
		head = tail;
		tail = temp;
	}

	private void reverse() {
		int fi = 0;
		int li = size - 1;

		while (fi < li) {
			Node temp1 = getAt(fi);
			Node temp2 = getAt(li);

			int temp = temp1.data;
			temp1.data = temp2.data;
			temp2.data = temp;

			fi++;
			li--;
		}
	}

	public Node getAt(int i) {
		Node temp = head;
		for (int j = 0; j < i; j++)
			temp = temp.next;
		return temp;
	}

	public void removeAtIndex(int i) {
		if (i == 0)
			removeFirst();
		if (i == size - 1)
			removeLast();
		Node t = head;
		for (int j = 0; j < i - 1; j++)
			t = t.next;
		Node m = t.next;
		t.next = t.next.next;
		m.next = null;
		size--;
	}

	public void getAtIndex(int i) {
		Node temp = head;
		for (int j = 0; j < i; j++)
			temp = temp.next;
		System.out.println(temp.data);
	}

	public void getFirst() {
		System.out.println(head.data);
	}

	public void getLast() {
		System.out.println(tail.data);
	}

	public void removeLast() {
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		size--;
	}

	public void removeFirst() {
		Node n = head;
		head = head.next;
		n.next = null;
		size--;
	}

	public void addatIndex(int i, int val) {
		Node temp = head;
		Node n = new Node();
		n.data = val;
		for (int j = 0; j < i - 1; j++)
			temp = temp.next;

		n.next = temp.next;
		temp.next = n;
		size++;
	}

	public void size() {
		System.out.println("size::" + size);
		System.out.println("--------------------------------------------------");
	}

	public void addLast(int i) {
		Node n = new Node();
		n.data = i;
		n.next = null;
		tail.next = n;
		tail = n;
		size++;
	}

	public void addFirst(int i) {
		Node n = new Node();
		n.data = i;
		if (size == 0) {
			head = tail = n;
			n.next = null;
			size++;
		} else {
			n.next = head;
			head = n;
			size++;
		}

	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print("\n-------------------------------------\n");
	}

	public void addNode(int i) {
		Node n = new Node();
		n.data = i;
		n.next = null;
		Node temp = head;

		if (size == 0) {
			head = tail = n;
			size++;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			tail = n;
			size++;
		}
	}

}
