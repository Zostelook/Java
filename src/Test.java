public class Test {

    public static void main(String []ss){



        Test2 t2 = new Test2();
        Test3 t3 = new Test3();
        t2.printSomething();

        Test2.displaySomething();




    }
}
class Test2{
    void printSomething(){
        System.out.println("Something");


    }

    static void displaySomething(){
        System.out.println("Something");
    }
}
class Test3{
    void show(){
        System.out.println("showing");
    }
}
