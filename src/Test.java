import java.util.Scanner;

public class Test {

    public static void main(String ss[]){

      // now learn for loop , inside para, There are three things initialization condition check and updation
        for(int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //how to make multiplication table of an integer number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int i;
        for(i=1;i<=10;i++){
            System.out.println(num*i);
        }

    }
}
