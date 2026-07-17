import java.util.Scanner;
public class mark{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter maths mark:");
    int maths=scan.nextInt();
     System.out.println("enter english mark:");
    int english=scan.nextInt();
     System.out.println("enter social mark:");
    int social=scan.nextInt();
     System.out.println("enter tamil mark:");
    int tamil=scan.nextInt();
     System.out.println("enter science mark:");
    int science=scan.nextInt();
    int total=maths+science+english+social+tamil;
    float avg=total/5;
    System.out.println("the total marks: "+total);
    System.out.println("the avg mark:"+avg);
    }
}