import java.util.Scanner;
public class alphabetcomparator{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter word:");
        String word1=scan.nextLine();
        System.out.print("enter word:");
        String word2=scan.nextLine();
        int result= word1.compareTo(word2);
            if(result==0){
                System.out.println("Both words are same");
            }
            else if(result<0){
                System.out.println("First word comes before second");
            }
            else{
                System.out.println("First word comes after second");
            }
        }
    }
