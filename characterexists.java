import java.util.Scanner;
public class characterexists{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String:");
        String word=scan.nextLine();
        System.out.println("enter letter");
        char ch=scan.next().charAt(0);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                System.out.println("character found");
                break;
            }
        }
    }
}