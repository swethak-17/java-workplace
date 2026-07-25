import java.util.Scanner;
public class NicknameGenerator{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter full name");
        String name=scan.nextLine();
        System.out.println(name.substring(0,3));
        System.out.println(name.substring(3));
    }
}