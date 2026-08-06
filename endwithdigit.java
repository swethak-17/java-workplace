import java.util.Scanner;
public class endwithdigit{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:");
        String word=scan.nextLine();
        char ch=word.charAt(word.length()-1);
            if(Character.isDigit(ch)){
                System.out.println("End With a Digit");
            }
            else{
                System.out.println("Not End With Digit");
            }
        }
    }
