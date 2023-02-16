import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Demo {

    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String t = in.next();
            String a[] = t.substring(0, 3).split("");
            String b[] = t.substring(3).split("");
            System.err.println(a.length);
            int q = 0;
            for(int z = 0; z < 3; z++){
                q += Integer.parseInt(a[z]) - Integer.parseInt(b[z]);
            }
            System.out.println(q == 0);
        }
        in.close();
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("answer");
    }
}