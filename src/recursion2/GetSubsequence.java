package recursion2;
import java.io.*;
import java.util.*;

public class GetSubsequence {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(gss(s));

	}

	public static ArrayList<String> gss(String str) {
		
		if(str.length()==0) {
			ArrayList<String> a=new ArrayList<>();
			a.add("");
			return a;
		}
		char ch=str.charAt(0);
		ArrayList<String> rres=gss(str.substring(1));
		ArrayList<String> mres=new ArrayList<>();
		
		for(String res:rres) {
			mres.add(""+res);
			mres.add(ch+res);
		}
		
		return mres;		
	}

}