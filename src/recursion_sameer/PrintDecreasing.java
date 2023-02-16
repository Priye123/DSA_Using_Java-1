package recursion_sameer;

import java.util.Scanner;

public class PrintDecreasing {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();

		f(5);

	}

	private static void f(int n) {
		
		if(n==0)
			return;
		
		System.out.println(n);//self-work
		f(n-1);//recursion
	}
	
	

//	private static void f(int i) {
//		System.out.println(i);//5
//		f1(i - 1);
//	}
//
//	private static void f1(int i) {
//		System.out.println(i);//4
//		f2(i - 1);
//	}
//
//	private static void f2(int i) {
//		System.out.println(i);//3
//		f3(i - 1);
//	}
//
//	private static void f3(int i) {
//		System.out.println(i);//2
//		f4(i - 1);
//	}
//
//	private static void f4(int i) {
//		System.out.println(i);//1
//		f5(i - 1);
//	}
//
//	private static void f5(int i) {
//		return;
//	}

}
