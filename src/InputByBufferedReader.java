import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputByBufferedReader {

    static int getLarge(int[]arr){
        int res=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[res]){
                res =i;
            }
        }
        return res;
    }


    public static void main(String []ss) {

        int []arr= new int[]{5,13,24,56,78,20};

      int index =  getLarge(arr);
      System.out.println(index);



    }
}
