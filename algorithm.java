public class algorithm {
    public static void main(String[] args) {

         int arr[]={10,-29,0,40,50};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print second largest element
        System.out.println("Second Largest Element: " + arr[arr.length - 2]);
    }
}