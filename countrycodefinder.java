import java.util.Scanner;
public class countrycodefinder{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter country code: ");
        String code=scan.nextLine();
        if(code.equalsIgnoreCase("IN")){
            System.out.println("India");
        }
        else if(code.equalsIgnoreCase("US")){
            System.out.println("United States");
        }
        else if(code.equalsIgnoreCase("UK")){
            System.out.println("United Kingdom");
        }
        else if(code.equalsIgnoreCase("LK")){
            System.out.println("Sri Lanka");
        }
        else if(code.equalsIgnoreCase("BD")){
            System.out.println("Bangladesh");
        }
        else{
            System.out.println("code not found");
        }
    }
}