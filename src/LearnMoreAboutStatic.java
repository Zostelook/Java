import java.util.Scanner;

public class LearnMoreAboutStatic {

    //  This is instence variable
   String name,mobile;
   int age , id;
    static String clsName;        // static variables have another name class variable, all object would like to share this memory

    {
        clsName="Lovely Professinal University";
    }
    LearnMoreAboutStatic(String n,String mob,int age,int id){
     name=n;
     mobile=mob;
     age=age;
     id=id;
    }

    void getData(){

    }

    void showInfo(){
        System.out.println(name);
        System.out.println(clsName);
        System.out.println(mobile);
        System.out.println(id);
        System.out.println(age);
    }


    public static void main(String arrayName[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("*************** Enter the detail of first student***************");
        System.out.println("Enter name of student");
        String name = sc.next();
        System.out.println("Enter  mobile number");
        String mobile= sc.next();
        sc.nextLine();
        System.out.println("Enter age of student");
        int age = sc.nextInt();
        System.out.println("Enter student ID");
        int id=sc.nextInt();

        LearnMoreAboutStatic obj=new LearnMoreAboutStatic(name,mobile,age,id);
        obj.showInfo();

    }
}
