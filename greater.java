public class greater{
    public static void main(String []args){
        int arr[]={100,20,90,56,70,30};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>50){
                count++;
            }
        }
        System.out.println("the count of number greater than 50: "+count);
    }
}