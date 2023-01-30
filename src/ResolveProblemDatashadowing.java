public class ResolveProblemDatashadowing {

    float x =36.00f;    // it is instance variable name x


    //  here we will create a class type static variable
   static ResolveProblemDatashadowing ref;


     void aboutThisKeyeward(){

        float x = 30.53f;


        System.out.println(ref.x);
    }

    public static void main(String []ss){

            ref = new ResolveProblemDatashadowing();    // this is an object of class

           ref.aboutThisKeyeward();       // this is just function call

        // this is call to another method


    }



    // you can resolve data shadowing problem liek this, but if you don't want to resolve by this, then you can
    // this keyward to resolve this problem directly



}
