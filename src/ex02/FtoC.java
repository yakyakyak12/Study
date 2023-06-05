package ex02;

import java.util.Scanner;

public class FtoC {
  public static void main(String[] args) {
    
    Scanner ss = new Scanner(System.in);
    System.out.print("번호를 선택하시오: ");
    int asd = ss.nextInt();

    if (asd == 1) {
      System.out.print("화씨온도를 입력하시오: ");
      double hasi = ss.nextInt();
      double subsi = (5.0 / 9.0) * (hasi - 32);
      System.out.print("섭씨온도는 " + subsi);
    } else {
      System.out.print("섭씨온도를 입력하시오: ");
      double hasi = ss.nextInt();
      double subsi = (5.0 / 9.0) * (hasi - 32);
      System.out.print("화씨온도는 " + subsi);
      
    }

  }
}
