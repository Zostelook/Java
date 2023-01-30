import java.util.Scanner;

public class BinaryToDecimal {


    static int binarytoDecimal(String binary){
        int ans=0;
        int multiplier =1;


        for(int i= binary.length()-1; i>=0; i--){
            int num =(int) binary.charAt(i)-48;


               ans = num*multiplier;
               multiplier = multiplier*2;


        }
        return ans;
    }
    public static void main(String []ss){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a binaary number :");
        String input = s.next();


       int output = binarytoDecimal(input);
       System.out.println(output);

    }
}
