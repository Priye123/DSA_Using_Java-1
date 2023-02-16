package stack;

import java.util.Scanner;

public class CustomStack {

	int data[];
	int tos;

	public CustomStack(int n) {
		data = new int[n];
		tos = -1;
	}

	public void push(int ele) {
		if (tos == data.length - 1) {
//			System.out.println("Stack Overflow");
//			System.exit(1);
			int data1[] = new int[data.length * 2];
			for (int i = 0; i < data.length; i++)
				data1[i] = data[i];
			data = data1;
		}
		tos++;
		data[tos] = ele;
	}

	public int pop() {
		int val = data[tos];
		tos--;
		return val;
	}

	private void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(data[i]);
		}
	}

	public int peek() {
		return data[tos];
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of stack::");
//		int n=sc.nextInt();
		CustomStack st = new CustomStack(5);
		//try {
			st.push(10);
			st.push(20);
			st.push(30);
			st.push(40);
			st.pop();
			st.push(34);
			st.push(67);
			st.push(31);
//		} catch (Exception e) {
//			st.push(31);
//		}
		st.display();

//		System.out.println(st.peek());
//		st.pop();
//		System.out.println(st.peek());

	}

}
