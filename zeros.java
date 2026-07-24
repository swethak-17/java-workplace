public class zeros{
    public static void main(String []args){
        int arr[]={1,6,3,0,46,0,3,0,6,0};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println("no of zeros: "+count);
    }
}