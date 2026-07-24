import java.util.Scanner;
public class recharge{
public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter phone number:");
    long phoneno=scan.nextLong();
    System.out.println("1.rs.199");
    System.out.println("2.rs.299");
    System.out.println("3.rs.399");
    System.out.println("choose your plan");
    String ch=scan.nextLine();
    System.out.println("Recharge Successfully");

System.out.println("------------------------------------");
System.out.println("Mobile Number: "+phoneno);
System.out.println("Recharge plan:"+ch);
System.out.println("Validity: 28 days");
System.out.println("-----------------------------------");
System.out.println("Thank You");
}
}