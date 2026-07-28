import java.util.Scanner;
public class moviesearch{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String arr[]={"Harry Potter","Con city","Love today","the intern","96"};
        System.out.println("Enter movie name: ");
        String movie=scan.nextLine();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(movie.equals(arr[i])){
                count++;
            }}
            if(count==1){
                System.out.println("Movie Found");
            }
            else{
                System.out.println("Movie not found");
            }
        
        }
    }
