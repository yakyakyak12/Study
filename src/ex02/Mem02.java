package ex02;

class Hello2 {
    static int price = 1000;
    String name = "커피";

    void run(){
        int n = 100;
        System.out.println("달린다");
    }
}

public class Mem02 {

    static int price = 10000;

    public static void main(String[] args) {
        System.out.println(Mem02.price);
        System.out.println(Hello2.price);
        Hello2 c = new Hello2();
        System.out.println(c.name);
        
        c.run();
        
    }
}