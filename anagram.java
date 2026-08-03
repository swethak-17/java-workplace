import java.util.Arrays;
import java.util.Scanner;
public class anagram{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a String:");
        String word1=scan.nextLine();
        System.out.println("enter another word: ");
        String word2=scan.nextLine();
        if(word1.length()!=word2.length()){
            System.out.println("It is not anagram");
        }
         word1=word1.toLowerCase();
         word2=word2.toLowerCase();
          char arr1[]=word1.toCharArray();
          char arr2[]=word2.toCharArray();
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          if(Arrays.equals(arr1,arr2)){
            System.out.println("It is anagram");
          }
          else{
            System.out.println("not");
          }

        
    }
}