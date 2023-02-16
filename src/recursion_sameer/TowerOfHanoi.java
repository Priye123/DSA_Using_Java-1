package recursion_sameer;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_of_disks=sc.nextInt();//3
//		int s=sc.nextInt();//1
//		int d=sc.nextInt();//2
//		int h=sc.nextInt();//3
		
		toh(no_of_disks,1,2,3);
	}

	private static void toh(int no_of_disks, int s, int d, int h) {
		
		if(no_of_disks==0)
			return;
			
		toh(no_of_disks-1,s,h,d);
		System.out.println(no_of_disks+"["+s+"->"+d+"]");
		toh(no_of_disks-1, h, d, s);
		
	}

}
