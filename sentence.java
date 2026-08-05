import java.util.Scanner;
public class sentence{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter sentence:");
        String word=scan.nextLine();
        String arr[]=word.split(" ");
        for(int i=0;i<arr.length;i++){
         int len=arr[i].length();
         for(int j=len-1;j>=0;j--){
            System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");

        }
    }
}
