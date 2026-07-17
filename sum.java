public class sum{
    public static void main(String []args){
        int arr[]={23,67,34,89,45,12};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of array: "+sum);
    }
}