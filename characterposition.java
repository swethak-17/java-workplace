import java.util.Scanner;
public class characterposition{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter word:");
        String word=scan.nextLine();
        System.out.println("enter character:");
        String ch=scan.nextLine();
        System.out.println("---------------------------");
        System.out.println("First occurrence: "+word.indexOf(ch));
        System.out.println("Last occurrence: "+word.lastIndexOf(ch));
        System.out.println("----------------------------");
    }
}