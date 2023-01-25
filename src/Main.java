import java.io.*;
import java.util.*;
public class Main {

    // here is method to check a number is divisible by 5 or not
    static void checkNumberIsDivisibleByFive(int num) {
        int rem = num % 10;
        if (rem == 5 || rem == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by five");
        }
    }

    // method print the lowercase eglish of a number if number is less than five else print Grater than 6
    static void printDigitInLowerCaseEnglis(int n){
        String str = Integer.toString(n);
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='1'){
                System.out.print("one");
            }
            if(c=='2'){
                System.out.print("tow");
            }

            if(c=='3'){
                System.out.print("three");
            }
            if(c=='4'){
                System.out.print("four");
            }
            if(c=='5'){
                System.out.print("five");
            }else{
                System.out.println("Grater then five");

            }

        }
    }




    public static void main(String[] ss){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Number :");
        int n = sc.nextInt();

       // checkNumberIsDivisibleByFive(n);
        printDigitInLowerCaseEnglis(n);





    }


}
