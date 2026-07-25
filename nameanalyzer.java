import java.util.Scanner;
public class nameanalyzer{
    public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your name:");
    String name=scan.nextLine();
    System.out.println("Name: "+name);
    System.out.println("length: "+name.length());
    System.out.println("First character: "+name.charAt(0));
    System.out.println("last character: "+name.charAt(name.length()-1));


    }
}