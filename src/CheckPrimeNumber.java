import java.util.Scanner;

public class CheckPrimeNumber {

   static void checkPrime(int number){
        int count =0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime");
        }
    }
    public static void main(String[]ss){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int input = sc.nextInt();
        checkPrime(input);
    }

}
