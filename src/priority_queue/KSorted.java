package priority_queue;

import java.util.Scanner;
//The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
//01 Test 1
//Input
//Expected output
//100.00 2
//gained 50%
//gained 50%
//225.00
//02 Test 2
//Input
//Expected output
//100.00 2
//lost 50%
//lost 50%
//25.00
//03 Test 3
//Input
//Expected output
//99.98 0
//99.98
//04 Test 4
//Input
//Expected output
//100.00 2
//gained 10%
//lost 10%
//99.00
class KSorted {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		float V = in.nextFloat();
		int N = in.nextInt();
		if(N==0) {
			System.out.println(V);
			return;
		}
		String type[]=new String[N];
		String percentage = null;
		for (int i = 0; i < N; i++) {
			type[i] = in.next();
			percentage = in.next();
		}

		float w = V;
		String res = percentage.substring(0, percentage.length() - 1);
		float no = Float.parseFloat(res);
		// int sum = 0;
		for (int i = 0; i < N; i++) {
			if (type[i].equals("gained")) {
				w = w + (w * no / 100);
			} else {
				w = w - (w * no / 100);
			}
		}

		System.out.println(w+"0");
	}
}
//100.00 2
//gained 50%
//gained 50%

//100.00 2
//lost 50%
//lost 50%

//100.00 2
//gained 10%
//lost 10%
