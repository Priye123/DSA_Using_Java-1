package clashofcode;

import java.util.ArrayList;
import java.util.Scanner;

//Given an even number greater than 2, print two prime numbers whose sum is equal to the given number. As there may be several combinations possible, print the pair whose first number is the lowest possible.
//A solution always exists according to Goldbach’s conjecture.
//Input
//An EVEN Number n
//Output
//Two space-separated integers which are the required prime numbers
//Constraints
//2<n<=10^9
//Example
//Input
//74
//Output
//3 71

public class COC_2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();	
		
		for(int i=3;i<n;i++) {
			if(isPrime(i)) {
				a.add(i);
			}
		}
		System.out.println(a);
		
		int i=0;
		int j=a.size()-1;
		
		while(i<j) {
			if(a.get(i)+a.get(j)>n) {
				j--;
			}else if(a.get(i)+a.get(j)<n) {
				i++;
			}else {
				System.out.println(a.get(i)+" "+a.get(j));
				return;
			}
		}
	}

	private static boolean isPrime(int n) {
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				 return false;
			}
		}
		 return true;
	}
	
}
