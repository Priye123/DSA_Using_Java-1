import java.util.Scanner;

public class CandidateCode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		String e = a + ":" + b;
		String f = c + ":" + d;

		String workingTimes[] = { e, f };
		int sum = 0;

		for (String hhmm : workingTimes) {
			String[] split = hhmm.split(":", 2);
			int mins = Integer.valueOf(split[0]) * 60 + Integer.valueOf(split[1]);
			sum += mins;
		}

		int x = (int) Math.floor(sum / 60);
		String s1 = Integer.toString(x);
		if (x >= 0 && x <= 9) {
			s1 = "0" + s1;
		}

		int z = sum % 60;
		String s2 = Integer.toString(z);
		if (z >= 0 && z <= 9) {
			s2 = "0" + s2;
		}
		int h=Integer.valueOf(s1);
		if(h>=24)
			h=h-24;
		
		String s3 = Integer.toString(h);
		if (h >= 0 && h <= 9) {
			s3 = "0" + s3;
		}
		String formattedWorkingTime = s3 + " " + s2;
		System.out.println(formattedWorkingTime);

	}

}
