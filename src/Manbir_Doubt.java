import java.util.Scanner;

public class Manbir_Doubt {

	public static void main(String[] args) {
		/*
		 * Scanner scn = new Scanner(System.in); int n = scn.nextInt(), sp, st; String
		 * y="",z=""; sp = n / 2; st = 1; for (int i = 1; i <= n; i++) { y=""; z="";
		 * for(int j=1;j<=sp;j++) y=y+"\t"; for(int k=1;k<=st;k++) z=z+"*\t";
		 * System.out.println(y+z); if (i <= n / 2) { sp--; st += 2; } else { sp++; st
		 * -= 2; }
		 * 
		 * }
		 */

		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt();
		 * 
		 * int st1 = ((2 * n) - 3) / 2, sp = 1; int st2 = st1; String x = "", y = "", z
		 * = "";
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * for (int j = 1; j <= st1; j++) x = x + "*\t";
		 * 
		 * for (int k = 1; k <= sp; k++) y = y + "\t";
		 * 
		 * for (int l = 1; l <= st2; l++) z = z + "*\t";
		 * 
		 * System.out.println(x + y + z);
		 * 
		 * if (i <= ((n / 2) + 1)) { st1--; sp += 2; st2 = st1; } else { st1++; sp -= 2;
		 * st2 = st1; } }
		 */

		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt();
		 * 
		 * int st1 = n/2+1, sp = 1; int st2 = st1; String x = "", y = "", z = "";
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * x = ""; y = ""; z = ""; for (int j = 1; j <= st1; j++) x = x + "*";
		 * 
		 * for (int k = 1; k <= sp; k++) y = y + " ";
		 * 
		 * for (int l = 1; l <= st2; l++) z = z + "*";
		 * 
		 * System.out.println(x + y + z);
		 * 
		 * if (i <= n / 2 ) { st1--; sp += 2; st2 = st1; } else { st1++; sp -= 2; st2 =
		 * st1; } }
		 */

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int os = n / 2, is = -1;
		String x = "", y = "";

		for (int i = 1; i <= n; i++) {
			x = "";
			y = "";
			for (int j = 1; j <= os; j++)
				x = x + "\t";
			for (int k = 1; k <= is; k++)
				y = y + "\t";

			if (i == 1 || i == n) {
				System.out.println(x + "*\t" + y);
			} else {
				System.out.println(x + "*\t" + y + "*\t");
			}

			if (i <= n / 2) {
				os += -1;
				is += 2;
			} else {
				os += 1;
				is -= 2;
				//xres+=2-i;
			}

		}

	}

}
