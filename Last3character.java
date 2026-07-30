import java.util.Scanner;
public class Last3character{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:");
        String word=scan.nextLine();
        System.out.println(word.substring(word.length()-3));
    }
}