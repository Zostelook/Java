import java.util.*;
public class Main {


 static void printAstrisksInTrianglurShap(){
     for(int i=1; i<=5; i++){
         for(int j =1; j<=i; j++){
             System.out.print("*");
         }
         System.out.println();
     }
 }




    public static void main(String[] args) {


     printAstrisksInTrianglurShap();

    // System.exit(0);    // it will terminate the program forcefully

     System.out.println("this is scond");


        int count =0;  // it will count how many time my loop has been executed
     int n=6;
     while(n>0){
         System.out.println("while");
         n--;
         count++;
     }
     System.out.println(count);

    }
}