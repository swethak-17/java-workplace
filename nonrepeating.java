import java.util.Scanner;
public class nonrepeating{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.nextLine();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int count=0;
        for(int j=0;j<word.length();j++){
            if(ch==word.charAt(j)){
                count++;
            }
        }
        if(count==1){
            System.out.println("First NonRepeating Character: " +ch);
        }
        
        }
    }
}