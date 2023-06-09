package myjava;

public class Dice {
  private int value;

  public Dice(){
    value = 0;
  }

  public int roll(){
    int r = (int)(Math.random()*6)+1;
    return r;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
