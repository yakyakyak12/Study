package ex05.ch03;

class 지구인 {

}

class 아시아인 extends 지구인 {
  // 오버라이드 됨
  String name = "아시아인";

  void speak() {
    System.out.println("아시아어");
  }
}

class 한국인 extends 아시아인 {
  String name = "한국인";

  void speak() {
    System.out.println("한국어");
  }
}

class 홍길동 extends 한국인 {
}

public class Exten01 {
  public static void main(String[] args) {
    한국인 p1 = new 한국인();
    System.out.println(p1.name);
    p1.speak();
  }

}
