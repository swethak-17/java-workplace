import java.util.Scanner;
public class middlecharacter{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String word=scan.nextLine();
        int len=word.length();
        int middle=len/2;
        System.out.println("Middle Character: "+word.charAt(middle));
    }
}