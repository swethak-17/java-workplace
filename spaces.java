import java.util.Scanner;
public class spaces{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:");
        String sentence=scan.nextLine();
        
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                System.out.print("-");
            }
            else{
                System.out.print(sentence.charAt(i));
            }
        }
    }
}