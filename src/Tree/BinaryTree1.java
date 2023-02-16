package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

class Pair {
	Node n;
	int state;

	public Pair(Node n, int state) {
		this.n = n;
		this.state = state;
	}
}

public class BinaryTree1 {

	public static void main(String[] args) throws Exception {
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
		
		for(Integer x:arr)
			System.out.println(x);
		
		Node root = constructTree(arr);
		iterativePrePostInTraversal(root);
	}

	public static void iterativePrePostInTraversal(Node node) {

		Stack<Pair> st = new Stack<>();
		Pair p = new Pair(node, 1);
		st.push(p);

		while (!st.empty()) {
			Pair top = st.peek();

			if (top.state == 1) {
				System.out.println("Pre " + top.n.data);
				top.state++;

				if (top.n.left != null) {
					//node = node.left;
					//top.n.left = node;
					Pair pa = new Pair(top.n.left, 1);
					st.push(pa);
				}

			} else if (top.state == 2) {
				System.out.println("In " + top.n.data);
				top.state++;

				if (top.n.right != null) {
//					node = node.right;
//					top.n.right = node;
					Pair pa = new Pair(top.n.right, 1);
					st.push(pa);
				}

			} else if (top.state == 3) {
				System.out.println("Post " + top.n.data);
				st.pop();
			}
		}
	}

	private static Node constructTree(Integer[] arr) {
		Stack<Pair> st = new Stack<>();
		Node node = new Node(arr[0], null, null);
		Pair pair = new Pair(node, 1);
		st.push(pair);
		int idx = 1;

		while (!st.empty()) {

			Pair top = st.peek();

			if (arr[idx] == null) {
				top.state++;
				idx++;
			} else {

				if (top.state == 1) {
					// Node n = new Node(arr[idx], null, null);
					// node.left = n;
					top.n.left = new Node(arr[idx], null, null);
					Pair p = new Pair(top.n.left, 1);
					st.push(p);
					idx++;
					top.state++;

				} else if (top.state == 2) {
					top.n.right = new Node(arr[idx], null, null);
					Pair p = new Pair(top.n.right, 1);
					st.push(p);
					idx++;
					top.state++;

				} else if (st.peek().state == 3) {
					st.pop();
					idx++;
				}
			}

		}
		return node;
	}

}
