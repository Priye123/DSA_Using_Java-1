package linked_list_old;

public class Linked_List_Overall {

	private class Node {
		int data;
		Node next;
	}

	Node head;

	public static void main(String[] args) {
		Linked_List_Overall l = new Linked_List_Overall();
		l.insert(20);
		l.display();
		System.out.println("--------------------");
		l.insert(30);
		l.insert(40);
		l.display();
		System.out.println("--------------------");
		l.insert(50);
		l.insert(60);
		l.insert(204);
		l.insert(240);
		l.insert(270);
		l.display();
		System.out.println("--------------------");
	}

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null)
				n = n.next;
			n.next = node;
		}
	}

	public void display() {

		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
