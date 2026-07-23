public class pairsum{
    public static void main(String []args){
        int arr[]={12,35,25,11,9,3,1};
        int target=36;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int values=arr[i]+arr[j];
                if(values==target){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+values);
                }
            }
        }
    }
}