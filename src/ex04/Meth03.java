package ex04;

class Account {
  // 입금 (입금할 금액, 계좌잔액)
  int deposit(int amount, int money) {
    int restMoney = money + amount;
    return restMoney; // 메서드를 호출한 라인으로 값 반환
  }

  // 출금 (입금할 금액 300, 계좌잔액 - money)
  int whithdraw(int amount, int money) {
    int restMoney = money - amount;
    return restMoney;
  }

  // 이체 (보낼 금액(amount), 받는사람 잔액(hMoney or iMOney), 보내는사람잔액)
  // 리턴 하지말고 출력만 해보기 자바는 2개를 리턴 할 수 없기 때문에
  void transfer(int amount, int hMoney, int iMoney) {
    int receiverMoney = hMoney - amount;
    int senderMoney = iMoney - amount;

    System.out.println("홍길동님의잔액 : " + receiverMoney);
    System.out.println("보는사람잔액 : " + senderMoney);
  }
}

public class Meth03 {
  public static void main(String[] args) {
    // 홍길동의 잔액
    int hMoney = 1000;

    // 임꺽정의 잔액
    int iMoney = 1000;

    // 홍길동이 입금을 2번하고, 출금 한번하기
    Account hAccount = new Account(); // Account 타입
    hMoney = hAccount.deposit(100, hMoney);
    System.out.println("홍길동님의 잔액 : " + hMoney);
    hMoney = hAccount.deposit(500, hMoney);
    System.out.println("홍길동님의 잔액 : " + hMoney);
    hMoney = hAccount.whithdraw(300, hMoney);
    System.out.println("홍길동님의 잔액 : " + hMoney);
    hAccount.transfer(300, hMoney, iMoney);

    // 임꺽정이 입금을 1번(100)하고, 출금 2번(300,500)하기
    Account iAccount = new Account();
    iMoney = iAccount.deposit(100, iMoney);
    System.out.println("임꺽정님의 잔액 : " + iMoney);
    iMoney = iAccount.whithdraw(300, iMoney);
    System.out.println("임꺽정님의 잔액 : " + iMoney);
    iMoney = iAccount.whithdraw(500, iMoney);
    System.out.println("임꺽정님의 잔액 : " + iMoney);

  }
}
