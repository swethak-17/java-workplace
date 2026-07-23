public class union{
    public static void main(String []args){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={6,7,8,9};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }
        for(int i=0;i<arr2.length;i++){
            int count=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]!=arr2[i]){
                count++;
                }}
                if(count==0){
                    System.out.println(arr2[i]);
                }
            } 
            
        }
    }
