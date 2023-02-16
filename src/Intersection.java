import java.util.Scanner;

class Intersection {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
//        StringBuilder sb=new StringBuilder("Raman");
//        sb.deleteCharAt(0);
//        System.out.println(sb);

       int sum1=0,sum2=0,sum3=0;

       for(int i=0;i<a.length();i++){
        char ch=a.charAt(i);
            if(Character.isUpperCase(ch)){
                sum1=sum1+(ch*1)-'a';
            }else if(Character.isLowerCase(ch)){
                sum2=sum2+(ch*1)-'A';
            }else if(Character.isDigit(ch)){
                sum3=sum3+(ch*1)-'0';
            }
       }
       if(sum1==0 || sum2==0)
        System.out.println(sum3);
       else if(sum1==0 || sum3==0)
       System.out.println(sum2);

    }
}

//You have to give the sum of the value of each character in the string, with the following coefficients:
//• Digits ×1 (1=1, 2=2, ...)
//• Lowercases ×2 (a=2, b=4, ...)
//• Uppercases ×3 (A=3, B=6, ...)
//Input
//A single line a, containing lower/upper letters and/or digits.
//Output
//A single number.
//Constraints
//1 ≤ length of a ≤ 6
//Example
//Input
//123
//Output
//6