package ex03;

import java.util.Scanner;

public class Gradung {
  public static void main(String[] args) {

    int asd;

    Scanner sc = new Scanner(System.in);
    System.out.print("성적을 입력하시오: ");
    asd = sc.nextInt();

    if (asd >= 90) {
      System.out.println("학점 A");
    } else if (asd > 80) {
      System.out.println("학점 B");
    } else if (asd > 70) {
      System.out.println("학점 C");
    } else if (asd > 60) {
      System.out.println("학점 D");
    } else {
      System.out.println("학점 F");
    }

  }
}
