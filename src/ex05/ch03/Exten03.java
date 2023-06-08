package ex05.ch03;

 class Animal{ //추상클래스
    void speak(){}; //추상메서드 (구체적 행위를 알지 못할 때)
}

class Cow extends Animal{

  
  void speak() {
   System.out.println("음메");
  }

  

}

class Dog extends Animal{
  void speak() {
    System.out.println("멍멍");

  }
}

class Cat extends Animal{
  void speak() {
    System.out.println("야옹");
  }

}

public class Exten03 {

  static void start(Animal u) { //추상클래스
    u.speak();
  }

  public static void main(String[] args) {
    Animal d = new Dog();
    Animal c = new Cat();
    start(d);
    start(c);
  }

}
