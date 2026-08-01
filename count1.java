import java.util.Scanner;
public class count1{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a String: ");
        String word=scan.nextLine();
        System.out.println("enter character:");
         char ch=scan.next().charAt(0);
         int count=0;
         for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                count++;
            }
         }
         System.out.println("Count of character '" + ch + "': " + count);
    }
}