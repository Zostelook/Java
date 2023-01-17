public class LearnMoreAboutStatic {

    //  This is instence variable
   // int count;
    static int count;        // static variables have another name class variable
    LearnMoreAboutStatic(){
        count++;
        System.out.println(count);
    }



    public static void main(String arrayName[]){
        new LearnMoreAboutStatic();
        new LearnMoreAboutStatic();
        new LearnMoreAboutStatic();
    }
}
