public class difference{
    public static void main(String []args){
        int arr[]={67,90,78,89,67};
        int large=arr[0];
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];

            }
        }
        int difference=large-small;
        System.out.println("the maximum difference: "+difference);
    }
}