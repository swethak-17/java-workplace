import java.util.Scanner;
public class reverse{
    public static void main(String []args){
        System.out.println("enter a word:");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int reverse=0;
        while(number!=0){
        int digit=number%10;
        reverse=reverse*10+digit;
        number=number/10;
        }
        System.out.println("the reverse: "+reverse);
        
        
    }
}