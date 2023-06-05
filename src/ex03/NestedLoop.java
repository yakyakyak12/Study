package ex03;

public class NestedLoop {
  public static void main(String[] args) {

    // for (int x = 0; x < 5; x++) {
    // for (int y = 0; y < 10; y++)
    // System.out.print("*");

    // System.out.println("");
    // }
    // for (int i = 1; i < 6; i++) {
    // if (i == 4)
    // break;
    // System.out.println(i);
    // }
    for (int i = 1; i < 6; i++) {
      if (i == 4)
        continue;
      System.out.println(i);
    }

  }
}