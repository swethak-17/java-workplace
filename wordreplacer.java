import java.util.Scanner;
public class wordreplacer{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sentence=scan.nextLine();
        System.out.println();
         System.out.println(sentence.replace("swetha","Geetha"));
    }
}