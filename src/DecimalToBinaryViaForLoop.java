import java.util.Scanner;

public class DecimalToBinaryViaForLoop {


    // this is method which will converd decimal number into binary number
    static String getBinary(int decNumber){

        String ans="";
        String fans="";

        if(decNumber==0){          //this is the base condition
            ans ="0";
        }
        for(int i=decNumber; decNumber!=0; ){
            if(decNumber%2==1){
                ans ="1";
            }else{
                ans = "0";
            }
            decNumber/= 2;
            fans =fans+ans;

        }
        return fans;

    }

    static String reverseString(String str){
        String res ="";
        for(int i=str.length()-1; i>=0; i--)
        {
            res += str.charAt(i);
        }
        return res;
    }
    public static void main(String []ss){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive Integer which you want to convert into binary :");
        int input = s.nextInt();

       String binary= reverseString(getBinary(input));
       System.out.println(binary);

    }
}
