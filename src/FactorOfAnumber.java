public class FactorOfAnumber {
    static void findFactor(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String []ss){
      //  findFactor(24);

    }
}
