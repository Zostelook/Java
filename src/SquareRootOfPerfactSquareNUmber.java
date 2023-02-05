import java.util.Scanner;

public class SquareRootOfPerfactSquareNUmber {
    static void squareRootOfNUmber(int number){
        int res =1;
        int count =0;
        while (number>0){

            number = number-res;
            res =res+2;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[]ss){
        Scanner sc = new Scanner(System.in);
      //  System.out.print("Enter a positive number:");
      //  int input = sc.nextInt();
      //  squareRootOfNUmber(input);

        int [] arr = new int[5];
        System.out.println(arr);
    }
}
