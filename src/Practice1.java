import java.util.Scanner;

public class Practice1 {
	public static void main(String args[]) throws Exception {
		Scanner sc= new Scanner(System.in);
		//String s=sc.nextLine();
		
//		Input
//		Line 1 : A pair of integers A and B which is the coordinates of the point in question.
//		Line 2 : An integer N which is the number of circles.
//		N next lines : Three integers x, y, r where (x, y) are the coordinates of a circle center and r is the circle radius.
//		Output
//		Line 1 : A single integer which is the number of circles that contains point (A, B).
//		Constraints
//		0 ≤ N ≤ 1000
//		-10000 ≤ A, B, x, y ≤ 10000
//		0 < r ≤ 10000
//		Example
//		Input
//		0 0
//		2
//		0 0 1
//		0 0 2
//		Output
//		2
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int n=sc.nextInt();
		int c=0;
		
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int r=sc.nextInt();
			
			if(x==a && y==b)
				c++;
			if(x+r==a && y==b)
				c++;
			if(x-r==a && y==b)
				c++;
			if(x==a && y+r==b)
				c++;
			if(x==a && y-r==b)
				c++;
				
		}
		System.out.println(c);
	}
}
//The Intersection over Union (IoU) is known to be a good metric for measuring overlap between two bounding boxes or masks.
//
//It is calculated as Area of the intersection / Area of the union.
//
//You will receive two bounding boxes:
//- x_1, y_1, w_1, h_1
//- x_2, y_2, w_2, h_2
//where x and y represent the top-left coordinate and w and h represent the width and the height.
//
//Compute the IoU!
//
//Warning:
//- The test cases are defined in a way that no approximation are required (e.g., no result is 0.33333333...).
//- Get rid of trailing 0s (1.0 should be 1).
//Input
//Line 1: x_1, y_1, w_1, h_1
//Line 2: x_2, y_2, w_2, h_2
//Output
//Line 1: The IoU
//Constraints
//0 ≤ x_1, y_1, x_2, y_2 < 1000
//0 < w_1, h_1, w_2, h_2 < 1000
//Example
//Input
//1 1 2 2
//2 1 2 3
//Output
//0.25
