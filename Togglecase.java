import java.util.Scanner;
public class Togglecase{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter word: ");
        String word=scan.nextLine();
        String result="";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                result+=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                result+=Character.toUpperCase(ch);
            }
            else{
                result +=ch;
            }
        }
        System.out.println("output: "+result);
    }
}