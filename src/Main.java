public class Main {

    int instanceVariable;   //non-static data member we can call it via an object

    static double classVariable;  // This is static variable that have another name is class variable we can call it directly in static context without creating object




    // Execution of program would be start from main() method , who one call main() - JVM call main method
    public static void main(String[] args) {
        Main ref=new Main();   // This is the object creation and "ref" is reference variable which contain reference id of an object

        System.out.println(ref.instanceVariable);

        System.out.println(classVariable);   // here is directly call for static variable



    }
}