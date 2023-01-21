import java.util.*;
public class Main {


 static void printAstrisksInTrianglurShap(int row,int col){
     for(int i=1; i<=row; i++){
         for(int j=1; j<=4-i; j++){
             System.out.print("  ");
         }
         for(int j=1; j<=i; j++){
             System.out.print(" *");
         }
         System.out.println();
     }
 }




    public static void main(String[] args) {


     printAstrisksInTrianglurShap(4,4);

    }
}