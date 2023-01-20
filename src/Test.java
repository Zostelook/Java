import java.util.Scanner;

public class Test {

    public static void main(String ss[]){

      // now learn for loop , inside para, There are three things initialization condition check and updation
    /*    for(int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //how to write a factorial value of an integer number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int facto=1;
        for(int i=1;i<=num;i++){
            facto = facto*i;
        }
        System.out.println(facto); */


    /*    int a=5;
        a+=6;
        switch (a-1){
            case 5 : System.out.print("10"); break;
            case 10 : System.out.print(15);
                      System.out.println(((a%2==0)? "even" :"-odd"));
            default: System.out.print(a%2);

        } */

        int mark =5;
        int grace = 2;
        int total = mark+(mark>6?++grace:--grace);

        System.out.println(total);
        char nptel []={'1','2','3','4','5','6'};

        System.out.println(nptel[nptel.length-2]+nptel[0]);
        System.out.println(nptel[0]+nptel[nptel.length-2]);
        System.out.print(" "+ nptel[nptel.length-2]+nptel[0]);
        System.out.print(" "+nptel[0]+nptel[nptel.length-2]);
       System.out.println();

        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while(temp>0)
        {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }



}
