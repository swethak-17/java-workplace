import java.util.Scanner;
public class duplicates{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string: ");
        String word=scan.nextLine();
        for(int i=0;i<word.length();i++){
            char str=word.charAt(i);
            if(word.indexOf(str)==i){
                System.out.print(str);
            }
        }
        }
        }