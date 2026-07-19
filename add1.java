public class add1{
    static void add(int a,int b){
        System.out.println("Add: "+(a+b));
    }
    static void add(int a,int b,int c){
         System.out.println("Add: "+(a+b+c));
    }
    public static void main(String []args){
        add(2,7);
        add(7,9,6);
    }
}