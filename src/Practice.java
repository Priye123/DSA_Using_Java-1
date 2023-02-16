import java.util.Scanner;

class Practice {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// if (in.hasNextLine()) {
		// in.nextLine();
		// }
		// for (int i = 0; i < N; i++) {
		// String ROW = in.nextLine();
		// }
		String s[] = new String[N];

		for (int i = 0; i < N; i++)
			s[i] = in.nextLine();

		for (int i = 0; i < N; i++) {
			//String h=s[i].replace('0', '-');
			//System.out.println(s[i].replace('0', '-'));
			s[i]=s[i].replace('0', '-');
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(s[i]);
			//System.out.println();
		}
			
	}
}