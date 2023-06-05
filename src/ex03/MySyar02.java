package ex03;

public class MySyar02 {
  public static void main(String[] args) {
    // System.out.println("*");
    // System.out.println("**");
    // System.out.println("***");
    // System.out.println("****");
    // System.out.println("*****");
    // System.out.println();

    // 1단계만 찍어보기
    // int end = 0;
    for (int i = 4; i < 6; i++) { // 행의 반복 (행의 시작 ; 조건; 증감)
      // end = end + 1;
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}