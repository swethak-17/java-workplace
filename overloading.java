public class overloading{
    static void display(){
        System.out.println("Hello!");
    }
    static void display(String name){
        System.out.println("Name: "+name);
        }
    public static void main(String []args){
        display();
        display("reena");
    }

}