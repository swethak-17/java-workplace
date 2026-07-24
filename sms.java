import java.util.Scanner;
public class sms{
        static void display(){
            Scanner scan=new Scanner(System.in);
        System.out.println("Enter student name:");
        String name=scan.nextLine();
        System.out.println("Enter roll number:");
        int rollno=scan.nextInt();
        System.out.println("enter maths mark:");
        int maths=scan.nextInt();
        System.out.println("enter science mark:");
        int science=scan.nextInt();
        System.out.println("enter social mark:");
        int social=scan.nextInt();
        System.out.println("enter tamil mark:");
        int tamil=scan.nextInt();
        System.out.println("enter english mark:");
        int english=scan.nextInt();
            System.out.println("name: "+name);
            System.out.println("roll no "+rollno);
            int avg=(maths+english+tamil+social+science)/5;
            System.out.println("average mark: "+avg);
        }
public static void main(String []args){
        sms s=new sms();
        s.display();
    }
}