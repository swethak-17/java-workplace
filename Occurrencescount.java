import java.util.Scanner;
public class Occurancecount{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter word:");
        String word=scan.nextLine();
        System.out.println("enter character:");
        char ch=scan.next().charAt(0);
        int count=0;
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                count++;
            }
        }
        System.out.println("Count of Special Character: "+count);
           }
}