public class average1{
    public static void main(String []args){
        int arr[]={10,90,20,80,30,70};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int average=sum/arr.length-1;
        System.out.println("the average: "+average);
    }
}