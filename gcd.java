public class gcd{
    static int display(int a,int b){
        int r=0;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String []args){
         System.out.println(gcd.display(24,36));
    }
}