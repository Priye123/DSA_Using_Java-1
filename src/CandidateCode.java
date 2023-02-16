/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		String e = a + ":" + b;
		String f = c + ":" + d;

		String workingTimes[] = { e, f };
		int sum = 0;
		// String formattedWorkingTime;
		for (String hhmm : workingTimes) {
			String[] split = hhmm.split(":", 2);
			//System.out.println(split[0] + " " + split[1]);
			int mins = Integer.valueOf(split[0]) * 60 + Integer.valueOf(split[1]);
			sum += mins;
		}

		int x = (int) Math.floor(sum / 60);
		// String s1=String.valueOf(x);
		String s1 = Integer.toString(x);
		// s1="0"+s1;
		// System.out.println(s1);
		if (countDigit(x) == 1) {
			s1 = "0" + s1;
			// System.out.println(s1);
		}
		int z = sum % 60;
		// String s2=String.valueOf(z);
		String s2 = Integer.toString(z);
		// s2="0"+s2;
		// System.out.println(s2);
		if (countDigit(z) == 1) {
			s2 = "0" + s2;
			// System.out.println(s2);
		}
		// String formattedWorkingTime = (int)Math.floor(sum/60) + " " + ( sum % 60 );
		// String formattedWorkingTime = (int)Math.floor(sum/60) + " " + ( sum % 60 );
		String formattedWorkingTime = s1 + " " + s2;
		System.out.println(formattedWorkingTime);

       
   }
   static int countDigit(int n) {
		String num = Integer.toString(n);

		// calculate the size of string

		return num.length();
	}

}
