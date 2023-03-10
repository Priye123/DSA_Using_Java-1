package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];

		for (int j = 0; j < n; j++) {
			String line = br.readLine();
			for (int k = 0; k < n; k++) {
				arr[j][k] = line.charAt(k) - '0';
			}
		}

		findCelebrity(arr);

	}

	public static void findCelebrity(int[][] arr) {
		// if a celebrity is there print it's index (not position), if there is not then
		// print "none"
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr[0].length;i++) {
			st.push(i);
		}
		
		while(!(st.size()==1)) {
			int i=st.pop();
			int j=st.pop();
			if(arr[i][j]==1) {
				st.push(j);
			}else {
				st.push(i);
			}			
		}
		
		int c=st.peek();
		System.out.println(c);
		
		for(int i=0;i<arr[0].length;i++) {
			if(arr[c][i]==1) {
				System.out.println("None");
				return;
			}
		}
		
		System.out.println(c);
	}

}
