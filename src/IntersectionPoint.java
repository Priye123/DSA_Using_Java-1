import java.util.Scanner;

class IntersectionPoint {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String func1 = in.nextLine();
		String func2 = in.nextLine();

		String h1 = func1.substring(0, 2);
		String h2 = func2.substring(0, 2);

		String h3 = func1.substring(4);
		String h4 = func2.substring(4);

		int a1 = Integer.parseInt(h1);
		int a2 = Integer.parseInt(h2);
		int b1 = -1;
		int b2 = -1;
		int c1 = Integer.parseInt(h3);
		int c2 = Integer.parseInt(h4);

//		float a1 = Float.parseFloat(h1);
//		float a2 = Float.parseFloat(h2);
//		float b1 = -1;
//		float b2 = -1;
//		float c1 = Float.parseFloat(h3);
//		float c2 = Float.parseFloat(h4);

		System.out.println(a1 + " " + a2 + " " + c1 + " " + c2);
		float demo = (a1 * b2) - (a2 * b1);
		System.out.println(demo);
		float g1 = (b1 * c2) - (b2 * c1);
		float g2 = (c1 * a2) - (c2 * a1);
		System.out.println(g1 + " " + g2);
		// int g2 = 0 - g3;
		float x1 = g1 / demo, x2 = g2 / demo;

		// System.out.printf("%.2f",x1 + "%.2f",x2);
		System.out.printf("(%.2f,%.2f)", x1, x2);
	}
}
//Given two functions y=a1x + b1 and y=a2x + b2, you must find their intersection point.
//Input
//Line 1: The function y1 with its two integer elements a1 & b1 separated by space.
//Line 2: The function y2 with its two integer elements a2 & b2 separated by space.
//Output
//Line 1: The intersection point, made of two float coordinates x1 & y1, in the form of:
//(x1,y1), leave two decimal places in each variable (Rounded), For example: If your x1 value is 0.291, it should print 0.29 in the final output.
//Constraints
//-10000<=a1,b1,a2,b2<=10000
//Example
//Input
//y = 20x + 7
//y = 49x + 12
//Output
//(-0.17,3.55)