import java.util.Scanner;
public class large{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter three values:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
        }
    }
