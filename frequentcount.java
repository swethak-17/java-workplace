import java.util.Scanner;
public class frequentcount{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string");
        String word=scan.nextLine();
        for(int i=0;i<word.length();i++){
            char arr=word.charAt(i);
            int count=0;
            if(word.indexOf(arr)!=i){
                continue;
            }
        
        for(int j=0;j<word.length();j++){
            if(word.charAt(j)==arr){
                count++;
            }
        }
        System.out.println(arr+" = "+count);
    }
    
    }
}