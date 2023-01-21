import java.util.*;
public class Main {

    static int i =0;
    Main(){
        System.out.println("This is constructor of Main class");
    }

    static {
        System.out.println("It would be execute only once before the main method ");
        // we can create an object of inside static block also, here constructor would be called automatically
      Main ref=  new Main();

        //

    }



   static void printOddEven(int n){
        for( i=1;i<=n;i++)
        {
            if(i%2==0)
                System.out.print("Even ");
            if(i%2!=0){
                System.out.print("odd ");
            }
        }
    }
    static void printStringChbyCh(String name){
       for( i=0;i<=name.length()-1;i++){
           System.out.print(name.charAt(i));
       }
    }

    static void reveserString(String str){
        for( i=str.length()-1; i!=-1;i--){
            System.out.println(str.charAt(i));
        }
    }

    // how we can print ASCII value of any character
    static void print_ASCII_Value(char firstSymbol,char second){
        for( i= (int)firstSymbol;i<=(int)second;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

     /*  Scanner sc = new Scanner(System.in);
       System.out.print("Enter an Integer Number less than 20 :");
       int input =sc.nextInt();
       printOddEven(input);
       */


      printStringChbyCh("Abhishek Yadav");

      /* from here you check actual size of String
      String str = "Abhishek";
      System.out.println(str.length());

       */

      reveserString("Infinite");
      print_ASCII_Value('a','z');


      // by the help of this you can directly print ASCII value
      System.out.println((int)'z');
    }
}