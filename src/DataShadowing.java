public class DataShadowing {

    /* meaning of data shadowing --> when the name of instance variable and local variable are same
    then data shadowing will occur
     */

    float x =30.00f;    // it is instance variable name x



  /* this is the static method, why we did use static keyword for this method, because we want to directly call
    without creating an object of Aboout_this_keyward class*/
    static void aboutThisKeyeward(){

        /* it is local variable name x, here you can observe the name of local variable
           and instance variable are same so data shadowing will occur here*/

        float x = 30.53f;
        System.out.println(x);
    }

    public static void main(String []ss){

         aboutThisKeyeward();   // this is my method call which will give me output - 30.53 --> the value of local variable

    }
}
