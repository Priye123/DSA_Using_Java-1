import java.util.Scanner;

//Given a versioning format <major>.<minor>.<patch>, like 10.4.15, you will be given 2 version strings a and b. Your task is to find out if b is newer than a.
//
//Note
//- For any patch orminor field, consider that .10 is newer than .9.
//Input
//Line 1: A version string a
//Line 2: A version string b
//Output
//If b is newer than a:
//- Print "major" if it's a new major version
//- Print "minor" if it's a new minor version within the same major version
//- Print "patch" if it's a patch within the same minor and major version
//If b is now newer than a, print old
//Constraints
//Every segment of the version (major, minor and patch) will be an integer in the range [0, 999] (inclusive).
//Example
//Input
//10.9.9
//10.9.8
//Output
//old

class PracticeRough {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();

		String s1[] = a.split("\\.");
		String s2[] = b.split("\\.");

        int a1=Integer.parseInt(s1[0]);
        int a2=Integer.parseInt(s1[1]);
        int a3=Integer.parseInt(s1[2]);
        int b1=Integer.parseInt(s2[0]);
        int b2=Integer.parseInt(s2[1]);
        int b3=Integer.parseInt(s2[2]);

        if(b1>a1){
            System.out.println("major");
        }else if(b2>a2){
            System.out.println("minor");
        }else if(b3>a3){
            System.out.println("patch");
        }else{
            System.out.println("old");
        }

	}
}