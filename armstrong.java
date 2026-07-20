public class armstrong{
    static void display(int a){
        int original=a;
        int count=0;
        int number=0;
        int temp=a;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=a;
        while(temp>0){
            int digit=temp%10;
            number=number+(int)Math.pow(digit,count);
            temp=temp/10;
        }
         if(number==original){
            System.out.println("Armstrong");
         }
         else{
            System.out.println("not an armstrong");
         }

        }

    
    public static void main(String []args){
        armstrong.display(153);
    }
}
