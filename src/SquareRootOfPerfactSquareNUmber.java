import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static void main(String[]ss)throws IOException {
      //  Scanner sc = new Scanner(System.in);
      //  System.out.print("Enter a positive number:");
      //  int input = sc.nextInt();
      //  squareRootOfNUmber(input);


        // here you can see the array size is zero then it will print the arr.length is zero , bro it is not a compilation errar
        int [] arr = new int[0];

        System.out.println(arr.length);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter a Number :");
        int n = Integer.parseInt(br.readLine());
        squareRootOfNUmber(n);


        System.out.print("Entr Your name :");
        String str = br.readLine();
        System.out.println(str);


    }
}
