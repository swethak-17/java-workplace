import java.util.Scanner;
public class wordexits{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String word[]={"swetha","geetha","pooja","B","vimali"};
        System.out.println("Enter word:");
        String name=scan.nextLine();
        for(int i=0;i<word.length;i++){
            if(name.equals(word[i])){
                System.out.println("word found");
                break;
            }
        }
    }

}