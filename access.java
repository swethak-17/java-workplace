public class access{
    public static void main(String []args){
        int arr[]={10,20,30,60,40};
        int value=60;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println("index: "+i);
            }
        }
    }
}