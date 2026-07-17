public class average{
    public static void main(String []args){
        int arr[]={12,67,34,21,89};
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=num+arr[i];
        }
        int avg=num/arr.length;
        System.out.println("the average of array: "+avg);
    }
}