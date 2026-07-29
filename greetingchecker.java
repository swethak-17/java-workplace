import java.util.Scanner;
public class greetingchecker{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String greet="hello";
        System.out.println("enter input: ");
        String input=scan.nextLine();
        if(greet.equalsIgnoreCase(input)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("unknown Greeting");
        }
    }
}