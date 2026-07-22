public class array{
    public static void main(String []args){
        int arr[]={10,20,30,40,10};
        int count=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            count++;
        }
        System.out.println("the number of elements: "+count);
    }
}