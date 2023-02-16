import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class A{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for(int i=N;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(N);
            }
            System.out.println();
        }
        //System.out.println("answer");
    }
}