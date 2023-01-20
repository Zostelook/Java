import java.util.Scanner;

public class Test {

    public static void main(String ss[]){

        System.out.println("Hello I am there,\nI am data ");
        System.out.println("*\n**\n***\n****\n*****");

        /* print the sum of three variable 3,6,and 9 without using int data type */
        System.out.println(3+6+9);

        /* But some programmer can write it something like this */
        int a=3,b=6,c=9;
        int sum = a+b+c;
        System.out.println(sum);

        // You can print the ASCII value of any character like this
        System.out.println((int)'A');
        System.out.println((int)'a');

        // how to take input from user
       Scanner s = new Scanner(System.in);
        System.out.println("Enter an Integer number :");
        int number = s.nextInt();
        System.out.println("Entered number is :  " +number);

        // how to find product of n number
        int n =6;
        int prod =1;
        for(int i=1;i<=n;i++){
            prod = prod*i;
        }
        System.out.println(prod);


        int aa =2;
        aa++;
        int bb=2;
        ++bb;
        System.out.println(aa);
        System.out.println(bb);

    }
}
