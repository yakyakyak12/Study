package ex03;

import java.util.Scanner;

public class oh {
  public static void main(String[] args) {
    int asd;
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하시오: ");
    asd = sc.nextInt();

    if (asd % 2 == 0) {
      System.out.println("입력된 정수는 짝수입니다.");
    } else {
      System.out.println("입력된 정수는 홀수입니다.");
    }
  }

}
