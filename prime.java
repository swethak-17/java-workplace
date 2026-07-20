public class prime{
    static String prime(int a){
        if(a<=1){
            return "not prime";
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return "not prime";
            }
            
        }
        return "prime";
    }
    public static void main(String []args){
        prime p1=new prime();
        System.out.println(p1.prime(7));
    }
}