import java.util.Scanner;

public class Main {


   static   int x;
     //   x=10;       we can't initialize like this in java
    {
        x=20;
    }



    public static void main(String ss[]){

        System.out.println(x);
        System.out.println(("A"+"B"+'A'));

       // difference between next() and nextLine();

        Scanner sc = new Scanner(System.in);              // this object of scanner class

        System.out.print("Enter your full name :");
        String str1 = sc.next();                      // it will read only one word for example you gave input - Abhishek kumar , it will take only Abhishek
        System.out.println(str1);


     /*   System.out.println("Again Enter your full name:");
        String str2 = sc.nextLine();                   it will read complete line
        System.out.println(str2);  */



        //  it will work , would be executed infinitely
        for(int i=0; true;){
            System.out.println("This is going to print infinitely");
        }

    }


}
