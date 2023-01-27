import java.util.*;
public class DecimalToBinary {

    // this method will convert a Decimal Number into binary
    static void convertDecimalToBinary(int decimalNumber){
        int reverse =0;
        while (decimalNumber>0)
        {
            int remainder = decimalNumber%2;

             reverse = reverse*10 +remainder;

            decimalNumber =decimalNumber/2;

        }

        System.out.println(reverse);


    }
    public static void main(String []args){
        convertDecimalToBinary(5);
    }

}
