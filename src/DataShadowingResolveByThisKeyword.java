public class DataShadowingResolveByThisKeyword {

    double d =45.07;

    void useThisKeword(){
        double d =45023.34;

        // without using this keyword
        System.out.println(d);

        // with using this keyword
        System.out.println(this.d);


        // you can observe another things here
        System.out.println(this);
    }
    public static void main(String[]ss){

        DataShadowingResolveByThisKeyword ref = new DataShadowingResolveByThisKeyword();
        ref.useThisKeword();


        //this --- contains reference ID of current object class

    }
}
