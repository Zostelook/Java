import java.util.Scanner;

public class CheckAllThreeCondition {


    //
   static void checkAllThreeConditionMethod(int a, int b){
        if((a<=10) && (b>=10))
        {
            System.out.print("true ");

        }else
        {
            System.out.print("false ");
        }
        if((a%2==0)||(b%2==0)){
           System.out.print("true ");
        }else {
            System.out.print("false ");
        }
        if(a!=b){
            System.out.print("true ");
        }else {
            System.out.print("false ");
        }
    }
    public static void main(String []ss){

       // object of scanner class we will take by the help of this.........
        Scanner sc = new Scanner(System.in);

        //now we will store the value of int inputFirst and int inputSecond
       System.out.println("Enter Two Integer giving by one space between them : ");
        int inputFirst = sc.nextInt();     // nextInt() is a predefined method in java which read an integer
        int inputSecond = sc.nextInt();


        // this is the for method which will take two argument
        checkAllThreeConditionMethod(inputFirst, inputSecond);


    }
}
