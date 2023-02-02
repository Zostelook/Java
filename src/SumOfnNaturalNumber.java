public class SumOfnNaturalNumber {


   // this is one approach
    static int sum(int n){
        return (n*(n+1))/2;
    }
    public static void main(String []ss){
    // int result=   sum(100);
    //    System.out.println(result);





       // this is another approach
        int result =0;
        int n =100;
        for(int i=1; i<=n; i++){
            result = result +i;
        }
        System.out.println(result);


        //
    }
}
