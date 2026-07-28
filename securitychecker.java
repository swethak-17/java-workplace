import java.util.Scanner;
public class securitychecker{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter link:");
        String link=scan.nextLine();
        if(link.startsWith("https://")){
            System.out.println("Secure website");
        }
        else{
            System.out.println("Not secure website");
        }
    }
}