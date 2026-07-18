import java.util.Scanner;
public class fibonacci{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=scan.nextInt();
        int a=0;int b=1;
         System.out.println(a);
         System.out.println(b);
        for(int i=1;i<=num;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}