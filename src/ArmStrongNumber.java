import java.util.Scanner;

public class ArmStrongNumber {

   int armStrongNumber(int num){
       int res=0;
       while (num>0){

           int rem = num%10;

           res =res + rem*rem*rem;

           num/=10;

       }
       return res;
   }





    public static void main(String []ss){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber which you want to check");
        int input =sc.nextInt();

        ArmStrongNumber ref = new ArmStrongNumber();
        int finalResult = ref.armStrongNumber(input);

        if(finalResult==input){
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }

        System.out.println(finalResult);


    }
}
