import java.io.*;
import java.util.*;

public class ArrayDemo{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int d=sc.nextInt();
		int first_index=0,last_index=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==d){
		        first_index=i;
		        break;
		    }
		}
		
		for(int i=first_index;i<n;i++){
		    if(arr[i]==d)
		        last_index=i;
		}
		System.out.println(first_index+"\n"+last_index);
 }

}