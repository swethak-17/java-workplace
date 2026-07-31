import java.util.Scanner;
public class longestword{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
    String word =scan.nextLine();
    String [] words=word.split(" ");
    String longest=words[0];
    for(int i=0;i<words.length;i++){
        if(words[i].length()>longest.length()){
            longest=words[i];
        }
    }
    System.out.println("Longest word: "+longest);
     }

    }
