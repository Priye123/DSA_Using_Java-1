package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RevisionTree1 {

	public static class Pair {

		Node node;
		int state;

		public Pair(Node node, int state) {
			this.node = node;
			this.state = state;
		}

	}

	public static class Node {
		Node left;
		Node right;
		int data;

		public Node(Node left, Node right, int data) {
			this.left = left;
			this.right = right;
			this.data = data;
		}

		public Node() {

		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		String[] values = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			if (values[i].equals("n") == false) {
				arr[i] = Integer.parseInt(values[i]);
			} else {
				arr[i] = null;
			}
		}
		// Integer arr1[]= {50,25,12,null,null,37,30,null,null,null, 75,62,null,
		// 70,null,null,87,null,null};
		Node node = construct(arr);
		display(node);

	}

	private static void display(Node node) {
		if (node == null)
			return;
		String s = "";
		if (node.left != null) {
			s = node.left.data + "";
		} else {
			s = ".";
		}
		s = s + "<-" + node.data + "->";
		if (node.right != null) {
			s = s + node.right.data;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		display(node.left);
		display(node.right);
	}

	public static Node construct(Integer[] arr) {

		Stack<Pair> st = new Stack<>();
		Node node = new Node(null, null, arr[0]);
		Pair p = new Pair(node, 1);
		st.push(p);
		int idx = 1;

		while (!st.isEmpty()) {

			Pair top = st.peek();

			if (top.state == 1) {
				if (arr[idx] != null) {
					top.node.left = new Node(null, null, arr[idx]);
					p = new Pair(top.node.left, 1);
					st.push(p);
					top.state++;
				} else {
					top.state++;
				}
				idx++;
			} else if (top.state == 2) {
				if (arr[idx] != null) {
					top.node.right = new Node(null, null, arr[idx]);
					p = new Pair(top.node.right, 1);
					st.push(p);
					top.state++;

				} else {
					top.state++;
				}
				idx++;
			} else if (top.state == 3) {
				st.pop();
			}

		}

		return node;

	}

}
