package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CustomStaticStack {

	int data[];
	int tos;

	public CustomStaticStack(int n) {
		data = new int[n];
		tos = -1;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of stack::");
		int n = Integer.parseInt(br.readLine());

		CustomStaticStack st = new CustomStaticStack(n);

		while (true) {
			System.out.println("1.push");
			System.out.println("2.peek");
			System.out.println("3.size");
			System.out.println("4.display");
			System.out.println("5.pop");

			System.out.print("Enter your choice::");
			int choice = Integer.parseInt(br.readLine());

			switch (choice) {

			case 1: {
				if(st.tos==st.data.length-1) {
					System.out.println("Stack overflow");
					break;
				}
				System.out.print("Enter element to push::");
				st.push(Integer.parseInt(br.readLine()));
				break;
			}

			case 2: {
				System.out.println("The top element is::" + st.peek());
				break;
			}

			case 3: {
				System.out.println("The size of stack is::" + st.size());
				break;
			}

			case 4: {
				st.display();
				break;
			}

			case 5: {
				System.out.println("The elements which is removed::" + st.pop());
				break;
			}

			default:
				System.out.println("Invalid choice..try again");
			}
		}

	}

	private int pop() {
		if (size() == 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		int val = data[tos];
		tos--;
		return val;
	}

	private void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.print("\n----------------------------------\n");
	}

	private int size() {
		return tos + 1;
	}

	private int peek() {
		if (tos == -1) {
			return -1;
		}
		return data[tos];
	}

	private void push(int n) {
		tos++;
		data[tos] = n;
	}

}
