package ex03;

import java.util.Scanner;

public class Coin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("금액을 입력하시오: ");
    final int money = sc.nextInt();
    // 정수 값을 받아 money 변수에 저장 final이 붙었기 때문에 값을 변경 할 수 없음.
    int restmoney = money;
    // money는 값을 변경 할 수 없음으로 남은 값을 받을 새로운 변수 생성
    int count;
    // 동전 개수를 담을 변수

    int[] tempMoney = { 500, 100, 50, 10 };
    for (int coin : tempMoney) {
      // tempMoney라는 배열에 각 요소는 coin 이라는 임시변수에 순차적으로 할당됨.
      count = restmoney / coin;
      System.out.println(coin + "원: " + count);
      restmoney = restmoney % coin;

    }
  }

}
