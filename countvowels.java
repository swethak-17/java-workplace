import java.util.Scanner;
public class countvowels{
public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word=scan.nextLine();
    int count=0;
    for(int i=0;i<word.length();i++){
        if(word.charAt(i)==('a')||word.charAt(i)==('e')||word.charAt(i)==('i')||word.charAt(i)==('o')||word.charAt(i)==('u')){
            count++;
                    }
        }   
        System.out.println("number of vowels: "+count);
}
}