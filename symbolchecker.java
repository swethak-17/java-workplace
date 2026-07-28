import java.util.Scanner;
public class symbolchecker{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter password: ");
        String password=scan.nextLine();
        System.out.println();
        if(password.contains("@")){
            System.out.println("it contains @");
        }
        else{
        System.out.println("@ is not found");
        }
    }
}