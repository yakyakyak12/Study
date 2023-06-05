package ex02;
  
class Mem02{
  static int ss = 16;
  String as = "구구";
  
}

public class Mem01 {
  public static void main(String[] args) {
    int a = 15;
    System.out.println(a);
    Mem02 java = new Mem02();
    System.out.println(java.as);
    System.out.println(java.ss);
    

  }
  
}
