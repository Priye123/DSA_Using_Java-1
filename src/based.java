import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class based {

    public static void main(String[] args) throws Exception {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter no. of Strings::");
    	int n=sc.nextInt();
    	//String[] s=new String[n];
    	List<String> s=new ArrayList<>();
		for(int i=0;i<n;i++)
    		s.add(sc.next());
    	int startIndex=sc.nextInt();
    	String target=sc.next();
    	
    	System.out.println(tool(s,startIndex,target));
    	
    }

	private static int tool(List<String> s, int startIndex, String target) {
		
		if(s.get(startIndex).equals(target)){
	        return 0;
	    }
		
		int lpointer=startIndex,rpointer=startIndex,leftsteps=0,rightsteps=0;
		int c=startIndex,d=startIndex;
		
		while(!(s.get(c).equals(target))) {
			lpointer--;
			if(lpointer<0) {
				lpointer=s.size()-1;
			}
			c=lpointer;
			leftsteps++;
		}
		
		while(!(s.get(d).equals(target))) {
			rpointer++;
			if(rpointer==s.size()) {
				rpointer=0;
			}
			d=rpointer;
			rightsteps++;
		}
		
		return Math.min(leftsteps, rightsteps);
		
	}

    

}