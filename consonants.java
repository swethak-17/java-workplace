import java.util.Scanner;
public class consonants{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String name=scan.nextLine();
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=('a')&&name.charAt(i)!=('e')&&name.charAt(i)!=('i')&&name.charAt(i)!=('o')&&name.charAt(i)!=('u')){
                count++;
            }
        }
            System.out.println("consonants: "+count);
    }
}