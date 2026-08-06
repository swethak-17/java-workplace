import java.util.Scanner;
public class replacevowels{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:");
        String word=scan.nextLine();
        for(int i=0;i<word.length();i++){
            
            if(word.charAt(i)=='a' || word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                System.out.print("-");
            }
            else{
                System.out.print(word.charAt(i));
            }
        }
    }
}