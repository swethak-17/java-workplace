public class elements{
    public static void main(String []args){
        int arr[]={10,20,30,40,50,60,70};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        int middle=count/2;
        int last=count-1;
        System.out.println("the first element: "+arr[0]);
        System.out.println("the middle element: "+arr[middle]);
        System.out.println("the end element: "+arr[last]);
    }
}