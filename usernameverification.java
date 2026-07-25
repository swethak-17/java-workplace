import java.util.Scanner;
public class usernameverification{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String name="Swetha";
        System.out.println("enter username:");
        String user=scan.nextLine();
        if(name.equalsIgnoreCase(user)){
            System.out.println("Login successfully");
        }
        else{
            System.out.println("Wrong user name");
        }
    }
}