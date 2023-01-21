import java.util.*;
public class Main {

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
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                System.out.print("Even ");
            if(i%2!=0){
                System.out.print("odd ");
            }
        }
    }
    static void printStringChbyCh(String name){
       for(int i=0;i<=name.length()-1;i++){
           System.out.println(name.charAt(i));
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


    }
}