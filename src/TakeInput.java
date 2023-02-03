import java.util.Scanner;

public class TakeInput {

    static void takeInput(){
        int result =0;
        Scanner sc = new Scanner(System.in);
        while (result<100){

           System.out.print("Enter an Integer");
            int input = sc.nextInt();
            result = result+input;

        }
        System.out.println(result);
    }
    public static void main(String[]ss){
        takeInput();
    }
}
