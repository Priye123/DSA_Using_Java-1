package bit_masking;
import java.util.Scanner;

class Practice {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String func1 = in.nextLine();
        String func2 = in.nextLine();

        String h1=func1.substring(0, 2);
        String h2=func2.substring(0, 2);

        int m1=Integer.parseInt(h1);
        int m2=Integer.parseInt(h1);

        String h3=func1.substring(4);
        String h4=func1.substring(4);

        int c1=Integer.parseInt(h3);
        int c2=Integer.parseInt(h3);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("(x1,y1)");
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