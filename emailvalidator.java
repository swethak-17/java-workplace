import java.util.Scanner;
public class emailvalidator{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Email");
        String email=scan.nextLine();
        if(email.contains("@")&& email.contains(".com")){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
    }
}