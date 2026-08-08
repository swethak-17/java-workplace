import java.util.Scanner;
public class digit{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string:");
        String word=scan.nextLine();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isDigit(ch)){
                System.out.print(ch);
            }
        }
    }
}