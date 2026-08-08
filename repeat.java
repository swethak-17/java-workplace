import java.util.Scanner;
public class repeat{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sentence=scan.nextLine();
        String word[]=sentence.split(" ");
        int count=0;
        for(int i=0;i<word.length;i++){
            if(word[i].equals("java")){
                count++;
            }
        }
        System.out.println("the count: "+count);
    }}