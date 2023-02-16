//import java.io.*;
//
//import java.util.*;
//
//public class StringDemo {
//
//  public static void main(String[] args) throws Exception {
////    Scanner scn = new Scanner(System.in);
////    String str = scn.next();
////    ArrayList< String> res = gss(str);
////    System.out.println(res);
////	  ArrayList<String> a=new ArrayList<>();
////	  a.add("abc");
//	  System.out.println(gss("abc"));
//  }
//
//  //bc ->  [ --,-c ,b-, bc ]
//  //abc->  [ ---,--c, -b-, -bc, a--,ab-,abc]
//
//  public static ArrayList< String> gss(String str) {
//    if (str.length() == 0) {
//      ArrayList< String> bres = new ArrayList< >();           //1
//      bres.add("");
//      return bres;
//    }
//    char ch = str.charAt(0);                                      //2
//    String ros = str.substring(1);                                //3
//
//    ArrayList< String> rres = gss(ros);                            //4
//    ArrayList< String> mres = new ArrayList< >();                   //5
//    for (String val : rres) {
//      char ch=
//      mres.add(ch+val);                                      //6
//      mres.add(val+ch);
//    }
//    
//    return mres;                                                  //8
//  }
//
//}

// Java program to print all the permutations
// of the given string
public class StringDemo {

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans)//str="",ans=abcd
	{

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");//abcd
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);//a

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + //ros=""
						str.substring(i + 1);

			// Recurvise call
			printPermutn(ros, ans + ch);//"",abcd
			
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		String s = "abcd";
		printPermutn(s, "");
	}
}







