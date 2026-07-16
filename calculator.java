import java.util.Scanner;
public class calculator{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int c;
    System.out.println("enter values of a:");
    int a=scan.nextInt();
    System.out.println("enter values of b");
    int b=scan.nextInt();
    System.out.println("1.Addition");
    System.out.println("2.substraction");
    System.out.println("3.Multipy");
    System.out.println("4.Division");
    System.out.println("Enter choice");
    int choice=scan.nextInt();
    switch(choice){
        case 1:
        c=a+b;
        System.out.println("Add: "+c);
        break;
        case 2:
            c=a-b;
            System.out.println("substract: "+c);
            break;
        case 3:
            c=a*b;
            System.out.println("multiply: "+c);
            break;
        case 4:
            c=a/b;
            System.out.println("division: "+c);
            break;
        default:
            System.out.println("Enter correct option");
       
        

            
    }


    }
}