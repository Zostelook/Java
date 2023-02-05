import java.util.Scanner;

public class FindMaxInArray {

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
      //  takeInput();

       int[] arr = new int[]{5,6,9,2,-8,34,-7};
       int max = arr[0];
       for(int i=0; i<arr.length; i++){
           if(arr[i]>max){
               max =arr[i];
           }
       }
       System.out.println(max);


        System.out.println();



    }
}
