package myjava;

public class Walking {
  private static double calculateCalory(int walk) {
    return 0.02 * walk;
  }

  public static void main(String[] args) {

    double result = calculateCalory(5000);
    System.out.println(result + " kacl");
  }

}
