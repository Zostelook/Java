import java.util.*;
public class Main {
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
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an Integer Number less than 20 :");
       int input =sc.nextInt();
       printOddEven(input);

    }
}