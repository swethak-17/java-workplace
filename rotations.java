import java.util.Scanner;
public class rotations{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a String:");
        String word1=scan.nextLine();
        String word2=scan.nextLine();
        if(word1.length()!=word2.length()){
            System.out.println("No Rotation");
        }
         String word=word1.concat(word1);
         if(word.contains(word2)){
            System.out.println("Rotational");
         }
         else{
            System.out.println("no rotation");
         }
    }
}