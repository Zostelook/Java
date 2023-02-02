public class MethodChaining {

    MethodChaining methodOne(){
        System.out.println("Method one");
        System.out.println(this);
        return this;


    }

    MethodChaining methodTwo(){
        System.out.println("Method Two");
        MethodChaining mt = new MethodChaining();
        System.out.println(mt);
        return mt;
    }

    public static void main(String[]ss){
        MethodChaining obj = new MethodChaining();
        MethodChaining ob2 =new MethodChaining();

        obj.methodOne();
        obj.methodTwo();


        // if we want to perform method chaining

        obj.methodTwo().methodOne();


       // reference ID would be different of this object

        System.out.println(ob2);


    }
}
