import java.util.Arrays;

public class SortOfArray {



    public static void main(String[]ss){
        int[]arr =new int[]{9,3,5,8,2,1,0,45};

      //  System.out.println(arr.length);
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // we can print an array using toString method

        System.out.println(Arrays.toString(arr));

    }
}
