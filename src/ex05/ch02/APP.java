package ex05.ch02;

public class App {
  static void attack(ProtossUnit u1, ProtossUnit u2) {
    // u2.hp = u2.hp - u1.attack;
    // System.out.println(u2.name + "이 " + u1.name + "에게 공격당했습니다.");
    // System.out.println(u2.name + "의 남은 hp : " + u2.hp);
  }

  public static void main(String[] args) {
    ProtossUnit z1 = new Zealot("질럿", 100, 10);
    ProtossUnit z2 = new Zealot("질럿2", 100, 10);
    ProtossUnit d1 = new Dragoon("드라군", 125, 10);
    ProtossUnit d2 = new Dragoon("드라군2", 125, 10);

    attack(z1, z2);
    attack(z1, z2);
    attack(d1, d2);
    attack(z1, d1);

  }

}
