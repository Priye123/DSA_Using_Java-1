package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CustomQueue {

	int data[];
	int front;
	int size;

	public CustomQueue(int n) {
		data = new int[n];
		front = 0;
		size = 0;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of stack::");
		int n = Integer.parseInt(br.readLine());

		CustomQueue que = new CustomQueue(n);

		while (true) {
			System.out.println("1.add");
			System.out.println("2.peek");
			System.out.println("3.size");
			System.out.println("4.display");
			System.out.println("5.remove");

			System.out.print("Enter your choice::");
			int choice = Integer.parseInt(br.readLine());

			switch (choice) {

			case 1: {
				if (que.size == que.data.length) {
					System.out.println("Queue overflow");
					break;
				}
				System.out.print("Enter element to add::");
				que.add(Integer.parseInt(br.readLine()));
				break;
			}

			case 2: {
				System.out.println("The top element is::" + que.peek());
				break;
			}

			case 3: {
				System.out.println("The size of stack is::" + que.size());
				break;
			}

			case 4: {
				que.display();
				break;
			}

			case 5: {
				System.out.println("The elements which is removed::" + que.remove());
				break;
			}

			default:
				System.out.println("Invalid choice..try again");
			}
		}

	}

	private void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.print("\n-------------------------\n");
	}

	private int remove() {
		int val = data[front];
		front=(front+1)%data.length;
		size--;
		return val;
	}

	private int size() {
		return size;
	}

	private int peek() {
		return data[front];
	}

	private void add(int n) {
		int rear = (front + size) % data.length;
		data[rear] = n;
		size++;
	}

}
