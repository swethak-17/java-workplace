import java.util.Scanner;
public class compression{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:");
        String word=scan.nextLine();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int count=0;
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)==ch){
                    count++;
                    
                }
            }
            boolean print=false;
            for(int j=0;j<i;j++){
                if(word.charAt(j)==ch){
                    print=true;
                    break;
                    
                }
            }

            if(!print){
             System.out.print(ch+""+count);
        }
        }
    }
}