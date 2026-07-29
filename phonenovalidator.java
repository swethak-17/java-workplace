import java.util.Scanner;
public class phonenovalidator{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter phone no:");
        String number=scan.nextLine();
        if(number.length()==10){
            System.out.println("Valid Phone number");
        }
        else{
            System.out.println("invalid");
        }
    }}