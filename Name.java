import java.util.Scanner;
public class Name{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scan.nextLine();
        System.out.println("--------------------------");
        System.out.println(name.trim());
        System.out.println("Uppercase: "+name.toUpperCase());
        System.out.println("Lowercase: "+name.toLowerCase());
        System.out.println("--------------------------");
    }
}