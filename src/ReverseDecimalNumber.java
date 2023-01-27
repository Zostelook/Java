import java.util.Scanner;

public class ReverseDecimalNumber {


    // this method will do reverse a decimal Number
    static void reverseDecimalNumber(int decimalNumber){
        int rev=0;    // you have to need rev variable initialize with zero

        while(decimalNumber>0){
            rev = rev*10+(decimalNumber%10);  // how we did that take the help of algorithm
            decimalNumber = decimalNumber/10;
        }

        // now print the reverse number
        System.out.println(rev);
    }


    // it is my Driver Code , my program will execute from here

    public static void main(String [] thisIsTheNameOfStringArrayYouCanChooseAccordingToYou){

        Scanner thisIsReferenceVariableWeWilTakeInputByTheHelpOfThis = new Scanner(System.in);

        System.out.println("Enter an Integer :");

        int input = thisIsReferenceVariableWeWilTakeInputByTheHelpOfThis.nextInt();

        // here we will call my method which will do my input into reverse
        reverseDecimalNumber(input);

    }
}
