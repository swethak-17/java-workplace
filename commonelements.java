public class commonelements{
    public static void main(String []args){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={9,8,7,6,5};
        System.out.print("common elements: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");

                }

            }
        }
    }
}