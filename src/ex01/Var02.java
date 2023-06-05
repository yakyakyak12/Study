package ex01;

public class Var02 {
  public static void main(String[] args) {
    byte b1 = 65; // 1Byte
    int n1 = 2100000000; // 4Byte
    // 숫자는 int, byte는 다른 프로그램에서 byte로 전송할때 공간을 효율적으로 사용하기 위해 사용
    long l1 = 210000000000L; // 8Byte
    double d1 = 2100000000.1111; // 8Byte
    char c1 = '가'; // 2Byte
    //값과 타입이 일치해야 합니다. ""는 문자열 '' 문자를 뜻함
    boolean check = true; // 1bit
    System.out.println(b1);
    System.out.println(n1);
    System.out.println(l1);
    System.out.println(d1);
    System.out.println(c1);
    System.out.println(check);
  }
}
