import java.util.Scanner;
public class passwordvalidator{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter password");
        String password=scan.nextLine();
        int count= password.length();
        if(count>=8){
            System.out.println("String password");
        }
        else{
            System.out.println("Weak passoword");

        }
    }
}