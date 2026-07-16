import java.util.Scanner;
public class tables{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter table to be printed:");
        int a=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+" * i = "+a*i);

        }
    }
}