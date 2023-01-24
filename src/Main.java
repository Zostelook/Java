public class Main {

    static  int []Array = {2,3,4,5,6,7,8};
   static int  size =0;


    static void reveseArray(int [] Array, int start, int end){
        int temp;
        while (start<end){
            temp =Array[start];
            Array[start] = Array[end];
            Array[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int [] Array , int size){
        for(int i=0; i<size; i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println();
    }




    public static void main(String[] args) {



        printArray(Array,7);

        reveseArray(Array,0,6);
        System.out.println("Print Reverse Aarry :");
        printArray(Array,7);

    }

}
