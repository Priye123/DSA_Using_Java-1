package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int d, Node left, Node r) {
			data = d;
			this.left = left;
			right = r;
		}
	}

	public static class Pair {
		Node node;
		int state;

		public Pair(Node n, int state) {
			this.node = n;
			this.state = state;
		}
	}

	public static void main(String[] args) throws IOException {
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
		// int lo = Integer.parseInt(br.readLine());
		// int hi = Integer.parseInt(br.readLine());

		Node root = construct(arr);
		// pathToLeafFromRoot(root, "", 0, lo, hi);

		// Integer arr1[]= {50,25,12,null,null,37,30,null,null,null, 75,62,null, 70,null,
		// null, 87,null,null};
		// Node root = construct(arr);

		// preOrder(root);
//		int size=size(root);
//		System.out.println("\n"+size);
//		
//		int sum=sum(root);
//		System.out.println(sum);
//		
//		int max=max(root);
//		System.out.println(max);
//		
//		int height=height(root);
//		System.out.println(height);
//		
//		display(root);
		// 19
		// 50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n
		// levelOrder(root);
		// IterativeDisp(root);
		// System.out.println(find1(root, 87));
		// klevelDown(root, 2);
		// knodeFar(root,75,1);
//		root = createLeftCloneTree(root);
//		display(root);
//		root = transBackFromLeftClonedTree(root);
//		display(root);
		// printSingleChildNodes(root, null);
//		root = removeLeaves(root);
//		display(root);

//		DiaPair diameter = diameter1(root);
//		System.out.println(diameter.dia);

		// System.out.println(tilt(root).tilt);
		//System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println(isBal1);
	}

	public static boolean isBal1=true;
	private static int isBal(Node node) {
		if(node==null) {
			return -1;
		}
		int lh=isBal(node.left);
		int rh=isBal(node.right);
		
		if(Math.abs(lh-rh)>1) {
			isBal1=false;
		}
		return Math.max(lh, rh)+1;
	}


	private static boolean isBST(Node node, int minval, int maxval) {

		if (node == null) {
			return true;
		}
		
		if(node.data >=maxval || node.data <=minval)
			return false;
		
		boolean ltree = isBST(node.left, minval, node.data);
		boolean rtree = isBST(node.right, node.data, maxval);
		if (ltree == true && rtree == true) {
			return true;
		}
		return false;
	}

	public static class TiltPair {
		int sum = 0;
		int tilt = 0;
	}

	private static TiltPair tilt(Node node) {
		if (node == null) {
			return new TiltPair();
		}

		TiltPair lp = tilt(node.left);
		TiltPair rp = tilt(node.right);

		TiltPair mans = new TiltPair();
		mans.sum = lp.sum + rp.sum + node.data;
		mans.tilt = lp.tilt + rp.tilt + Math.abs(lp.sum - rp.sum);

		return mans;
	}

	public static class DiaPair {
		int ht;
		int dia;
	}

	private static DiaPair diameter1(Node node) {

		if (node == null) {
			DiaPair dp = new DiaPair();
			dp.ht = -1;
			dp.dia = 0;
			return dp;
		}

		DiaPair lp = diameter1(node.left);
		DiaPair rp = diameter1(node.right);

		DiaPair myans = new DiaPair();
		myans.ht = Math.max(lp.ht, rp.ht) + 1;
		myans.dia = Math.max(lp.ht + rp.ht + 2, Math.max(lp.dia, rp.dia));

		return myans;
	}

	public static Node removeLeaves(Node node) {

		if (node == null)
			return null;

		if (node.left == null && node.right == null) {
			return null;
		}
		node.left = removeLeaves(node.left);
		node.right = removeLeaves(node.right);

		return node;
	}

	public static void printSingleChildNodes(Node node, Node parent) {

		if (node == null)
			return;

		if (parent != null && parent.left != null && parent.right == null) {
			System.out.println(node.data);
		} else if (parent != null && parent.left == null && parent.right != null) {
			System.out.println(node.data);
		}
		printSingleChildNodes(node.left, node);
		printSingleChildNodes(node.right, node);
	}

	private static Node transBackFromLeftClonedTree(Node node) {

		if (node == null)
			return null;

		Node ltrans = transBackFromLeftClonedTree(node.left.left);
		Node rtrans = transBackFromLeftClonedTree(node.right);

		node.left = ltrans;
		node.right = rtrans;

		return node;
	}

	private static Node createLeftCloneTree(Node node) {
		if (node == null)
			return null;

		Node leftclone = createLeftCloneTree(node.left);
		Node rightclone = createLeftCloneTree(node.right);

		Node nn = new Node(node.data, leftclone, null);
		node.left = nn;

		node.right = rightclone;

		return node;
	}

	public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi) {
		if (node == null)
			return;

		if (node.left == null && node.right == null) {
			sum = sum + node.data;
			if (sum >= lo && sum <= hi) {
				System.out.println(path + node.data);
			}
			return;
		}
		pathToLeafFromRoot(node.left, path + node.data + " ", sum + node.data, lo, hi);
		pathToLeafFromRoot(node.right, path + node.data + " ", sum + node.data, lo, hi);
	}

	private static void knodeFar(Node node, int data, int k) {
		ArrayList<Node> ntr = find2(node, data);

		for (int i = 0; i < ntr.size(); i++) {
			klevelDown(ntr.get(i), k - i, i == 0 ? null : ntr.get(i - 1));
		}

	}

	private static void klevelDown(Node node, int k, Node blocker) {
		if (node == null || k < 0 || node == blocker) {
			return;
		}

		if (k == 0) {
			System.out.println(node.data);
			return;
		}
		klevelDown(node.left, k - 1, blocker);
		klevelDown(node.right, k - 1, blocker);
	}

	private static ArrayList<Node> find2(Node node, int data) {

		if (node == null) {
			return new ArrayList<>();
		}

		if (node.data == data) {
			ArrayList<Node> name = new ArrayList<>();
			name.add(node);
			return name;
		}

		ArrayList<Node> pathleft = find2(node.left, data);
		if (pathleft.size() > 0) {
			pathleft.add(node);
			return pathleft;
		}

		ArrayList<Node> pathright = find2(node.right, data);
		if (pathright.size() > 0) {
			pathright.add(node);
			return pathright;
		}

		return new ArrayList<>();
	}

	private static void klevelDown(Node node, int k) {
		Queue<Node> q = new ArrayDeque<>();
		int count = 0;
		q.add(node);

		while (q.size() > 0) {
			int sz = q.size();
			while (sz-- > 0) {
				Node rem = q.remove();
				if (rem.left != null)
					q.add(rem.left);
				if (rem.right != null)
					q.add(rem.right);
			}
			count++;

			if (count == k) {
				// System.out.println(q);
				for (Node n : q) {
					System.out.print(n.data + " ");
				}
				return;
			}
		}

	}

//	private static void klevelDown(Node node,int k) {
//		if(node==null && k<0) {
//			return;
//		}
//		
//		if(k==0) {
//			System.out.println(node.data);
//			return;
//		}
//		klevelDown(node.left, k-1);
//		klevelDown(node.right, k-1);
//	}

	private static ArrayList<Integer> find1(Node node, int data) {

		if (node == null) {
			return new ArrayList<>();
		}

		if (node.data == data) {
			ArrayList<Integer> name = new ArrayList<>();
			name.add(node.data);
			return name;
		}

		ArrayList<Integer> pathleft = find1(node.left, data);
		if (pathleft.size() > 0) {
			pathleft.add(node.data);
			return pathleft;
		}

		ArrayList<Integer> pathright = find1(node.right, data);
		if (pathright.size() > 0) {
			pathright.add(node.data);
			return pathright;
		}

		return new ArrayList<>();
	}

//	private static boolean find(Node node, int data) {
//		
//		if(node==null) {
//			return false;
//		}
//		
//		if(node.data==data) {
//			return true;
//		}
//		
//		boolean left=find(node.left,data);
//		if(left==true) {
//			return true;
//		}
//		
//		boolean right=find(node.right,data);
//		if(right==true) {
//			return true;
//		}
//		
//		return false;
//	}

	private static void IterativeDisp(Node node) {
		Pair p = new Pair(node, 1);
		Stack<Pair> st = new Stack<>();
		st.push(p);
		String pre = "", in = "", post = "";
		while (st.size() > 0) {

			Pair top = st.peek();
			int s = top.state;
			Node n = top.node;

			if (s == 1) {
				pre = pre + n.data + " ";
				if (n.left != null) {
					Pair pt = new Pair(n.left, 1);
					st.push(pt);
				}
				top.state++;
			} else if (s == 2) {
				in = in + n.data + " ";
				if (n.right != null) {
					Pair pt = new Pair(node.right, 1);
					st.push(pt);
				}
				top.state++;
			} else {
				post = post + n.data + " ";
				st.pop();
			}

		}
		System.out.println(pre);
		System.out.println(in);
		System.out.println(post);

	}

	private static void levelOrder(Node node) {
		Queue<Node> q = new ArrayDeque<>();
		q.add(node);

		while (q.size() > 0) {
			int sz = q.size();
			while (sz-- > 0) {
				Node rem = q.remove();
				System.out.print(rem.data + " ");

				if (rem.left != null) {
					q.add(rem.left);
				}
				if (rem.right != null) {
					q.add(rem.right);
				}
			}
			System.out.println();
		}

	}

	private static void display(Node node) {
		if (node == null)
			return;

		String str = "";
		if (node.left == null)
			str = str + "null";
		else
			str = str + node.left.data;
		str = str + "<-" + node.data + "->";
		if (node.right == null)
			str = str + "null";
		else
			str = str + node.right.data;
		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	private static int height(Node root) {
		if (root == null)
			return -1;

		int lh = height(root.left);
		int rh = height(root.right);

		return Math.max(lh, rh) + 1;
	}

	private static int max(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;

		int mleft = max(root.left);
		int mright = max(root.right);

		return Math.max(root.data, Math.max(mleft, mright));
	}

	private static int sum(Node root) {
		if (root == null)
			return 0;

		int sleft = sum(root.left);
		int sright = sum(root.right);

		return sleft + sright + root.data;
	}

	private static int size(Node root) {

		if (root == null)
			return 0;

		int left = size(root.left);
		int right = size(root.right);

		return left + right + 1;
	}

	private static void preOrder(Node root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	public static Node construct(Integer[] arr) {

		Node root = new Node(arr[0], null, null);
		Pair p = new Pair(root, 1);

		Stack<Pair> st = new Stack<>();
		st.push(p);

		int idx = 0;

		while (st.size() > 0) {

			Pair top = st.peek();

			Node n = top.node;
			int s = top.state;

			if (s == 1) {
				idx++;
				if (arr[idx] != null) {
					n.left = new Node(arr[idx], null, null);
					Pair lp = new Pair(n.left, 1);
					st.push(lp);
					top.state++;
				} else {
					n.left = null;
					top.state++;
				}
			} else if (s == 2) {
				idx++;
				if (arr[idx] != null) {
					n.right = new Node(arr[idx], null, null);
					Pair rp = new Pair(n.right, 1);
					st.push(rp);
					top.state++;
				} else {
					n.right = null;
					top.state++;
				}
			} else {
				st.pop();
			}
		}
		return root;
	}
}
