package leetcode;

import java.util.ArrayList;
import java.util.Collection;
//You work at McBurger's and are responsible for cooking burgers. McBurger has N ingredients available.
//On your shelf, you receive P burger orders.
//Your job is to find out whether it is possible to design all the orders with the N ingredients you have. You will have to report back to Bob, your chef, and tell him if you have enough ingredients to make everything.
//Input
//Line 1: N available ingredients.
//Line 2: A list of N ingredients represented by an uppercase and separated by a space.
//Line 3: P orders.
//Following P lines: An order, with the necessary ingredients separated by a space.
//Output
//Line 1: YES if you can do all the orders, else NO.
//Constraints
//1 ≤ N ≤ 50
//1 ≤ P ≤ 10
//1 ≤ maximum length of an order ≤ 40
//Example
//Input
//5
//S S M M P
//2
//P M
//S S
//Output
//YES
import java.util.Scanner;

class COC_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Collection<Character> a1 = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			a1.add(sc.next().charAt(0));
		}

		int P = sc.nextInt();

		for (int i = 0; i < P; i++) {
			for (int j = 0; j < P; j++) {
				// arr2[i][j] = sc.next().charAt(0);
				char ch = sc.next().charAt(0);
				if (a1.contains(ch)) {
					a1.remove(ch);
				} else {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");

	}

}

//class Solution {
//
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//
//		char arr1[] = new char[N];
//
//		for (int i = 0; i < N; i++)
//			arr1[i] = sc.next().charAt(0);
//
//		int P = sc.nextInt();
//
//		char arr2[][]=new char[P][P];
//		
//		for(int i=0;i<P;i++) {
//			for(int j=0;j<P;j++) {
//				arr2[i][j] = sc.next().charAt(0);
//			}
//		}
//		int m=0,n=0,c=1;
//		
//		for(int i=0;i<P;i++) {
//			for(int j=0;j<N;j++) {
//				if(c<=P) {
//					if(arr1[j]==arr2[m][n]) {
//				}
//				
//			}
//		}
//
//	}
//}
//}
