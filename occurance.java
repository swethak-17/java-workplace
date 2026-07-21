import java.util.Scanner;
public class occurance{
    public static void main(String []args){
        int arr[]={10,20,30,40,10,10,90};
        Scanner scan=new Scanner(System.in);
        int first=-1;
        int last=-1;
        System.out.println("enter a values:");
        int value=scan.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                if(first==-1){
                    first=i;

                }
                last=i;
            }
        }
        if(first==-1){
            System.out.println("element not found");
        }
        else{
        System.out.println("the first occurance: "+first);
        System.out.println("the last occurance: "+last);
    }
    }
}