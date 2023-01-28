import java.util.Scanner;
import java.lang.String;

public class ReverseDecimalNumber {




    // this method will do reverse a decimal Number
    static void reverseDecimalNumber(int decimalNumber){
        int rev=0;    // you have to need rev variable initialize with zero

        while(decimalNumber>0)
        {
            rev = rev*10+(decimalNumber%10);      // how we did that take the help of algorithm
            decimalNumber = decimalNumber/10;
        }

        // now print the reverse number
        System.out.println(rev);
    }

    static String reverseString(String str){
        String res ="";
        for(int i=str.length()-1; i>=0; i--)
        {
          res += str.charAt(i);
        }
        return res;
    }


    // it is my Driver Code , my program will execute from here

    public static void main(String [] ss){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter an Integer :");

       int input = s.nextInt();

        // here we will call my method which will do my input into reverse
        reverseDecimalNumber(input);

       String revStr= reverseString("Abhishek");
       System.out.println(revStr);


    }
}
