package myjava;

public class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public Circle() {
    this(0);
  }

  double getArea() {
    return 3.14 * radius * radius;
  }
}
