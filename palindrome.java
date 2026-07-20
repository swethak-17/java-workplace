public class palindrome{
    static String display(int a){
        int original=a;
        int b=0;
        int value=0;
        while(a>0){
        value=a%10;
        b=b*10+value;
        a=a/10;
        }
        if(original==b){
            return"palindrome";
        }
        else{
            return "not palindrome";
        }
    }
    public static void main(String []args){
    System.out.println(palindrome.display(12));
    }
}