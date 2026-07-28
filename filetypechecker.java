import java.util.Scanner;
public class filetypechecker{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter file :");
        String file=scan.nextLine();
        if(file.endsWith(".pdf")){
            System.out.println("PDF File");
        }
        else if(file.endsWith(".jpg")){
            System.out.println("JPG File");
        }
        else if(file.endsWith(".gif")){
            System.out.println("GIF File");
        }
        else if(file.endsWith(".png")){
            System.out.println("PNG File");
        }
        else{
            System.out.println("TXT File");
        }
    }
}