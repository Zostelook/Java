import java.util.Scanner;

public class SunOfnUsingArrayDataStructure {
   static int getSome(int[]arr, int n){
        int sum =0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }return sum;

    }

    static void printTheSum(int sumResult){
        System.out.println(sumResult);
    }

   static int search(int[]arr, int size, int searchElemrnt){
       for(int i=0; i<size; i++){


           if(searchElemrnt==arr[i]){
               return i;
           }
       }
       return -1;
    }


    public static void main(String [] ss){
       /* int arr2[] = {2,4,3,6,7,9};
      int sumResult=  getSome(arr2,6);

       printTheSum(sumResult);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int arrSize = sc.nextInt();
        System.out.print("Enter "+arrSize+" Integer Number :");
        int[]arr2 = new int[arrSize];
        for(int i=0; i<arrSize; i++){
          arr2[i] = sc.nextInt();
        }
       int sumResul= getSome(arr2,arrSize);
        printTheSum(sumResul); */

        int[] arrS = {4,5,6,1,2,43,98,9,90}
;
      int key =  search(arrS,9,91);
      System.out.print(key);
    }
}
