package ex05.ch01;

public class App {

  static void attack(Zealot u1, Dragoon u2) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  static void attack(Dragoon u1, Zealot u2) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  static void attack(Zealot u1, DarkTemplar u2) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  static void attack(Zealot u1, Zealot u2) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  static void attack(Dragoon u2, Dragoon u1) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  static void attack(Dragoon u2, DarkTemplar u1) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  static void attack(DarkTemplar u1, Zealot u2) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  static void attack(DarkTemplar u1, Dragoon u2) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  static void attack(DarkTemplar u1, DarkTemplar u2) {
    u2.hp = u2.hp - u1.attack;
    System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  public static void main(String[] args) {
    Zealot z1 = new Zealot("질럿1", 100, 10);
    Zealot z2 = new Zealot("질럿2", 100, 10);
    Dragoon d1 = new Dragoon("드라군1", 100, 5);
    Dragoon d2 = new Dragoon("드라군2", 100, 5);
    DarkTemplar dt1 = new DarkTemplar("다크템플러1", 100, 50);
    DarkTemplar dt2 = new DarkTemplar("다크템플러2", 100, 50);
    // 질럿 -> 드라군 공격
    attack(z1, d1);
    attack(z2, dt1);
    attack(z1, z2);
    System.out.println();
    // 메서드에 옮겨서 메서드에서 처리하도록

    // 드라군 -> 질럿 공격
    attack(d1, z1);
    attack(d1, d2);
    attack(dt1, dt1);
    System.out.println();

    // 다크 템플러 공격
    attack(dt1, d1);
    attack(dt1, dt2);
    attack(dt1, z2);
    System.out.println();

    // 오버로딩 체험하기
    System.out.println();
    System.out.println(1);
    System.out.println(1.1);
    System.out.println('가');
    System.out.println("문자열");
    System.out.println("true");

  }

}
