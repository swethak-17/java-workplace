public class example{
    public static void main(String []args){
        int arr[]={10,32,45,36,89,86};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                count++;
            }

        }
        System.out.println("the count multiple of 5:"+count);
    }
}