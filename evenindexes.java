import java.util.Scanner;
public class evenindexes{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter word: ");
        String word=scan.nextLine();
        for(int i=0;i<word.length();i++){
            if(i%2==0){
                System.out.println(word.charAt(i));
            }
        }
    }
}