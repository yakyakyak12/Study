package myjava;

public class DiceTest {
  public static void main(String[] args) {
    Dice d1 = new Dice();
    Dice d2 = new Dice();
    int count = 0;

    while (true) {
      int roll1 = d1.roll();
      int roll2 = d2.roll();
      int sum = roll1 + roll2;
      count++;
      System.out.println("주사위1= " + roll1 + "  " + "주사위2= " + roll2 + "  " + "합= " + sum);

      if (sum == 2) {
        System.out.println("(1, 1)이 나오는데 걸린 횟수= " + count);
        return;
      }
    }

  }
}
