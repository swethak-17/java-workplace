import java.util.Scanner;
public class emptystringchecker{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter input:");
        String input=scan.nextLine();
        if(input.isEmpty()){
            System.out.println("Input is empty");
        }
        else{
            System.out.println("Input is not empty");
        }
    }
}