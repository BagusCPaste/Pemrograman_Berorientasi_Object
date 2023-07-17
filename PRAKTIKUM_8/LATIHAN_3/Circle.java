package PRAKTIKUM_8.LATIHAN_3;

public class Circle extends Shape{
       public double radius = 1.0f;
              public Circle() {
       }
       
       public Circle(double radius) {
              this.radius = radius;
       }

       public Circle(double radius, String color, boolean filled) {
              this.radius = radius;
              this.color = color;
              this.filled = filled;
       }

       public double getRadius() {
              return radius;
       }

       public void setRadius(double radius) {
              this.radius = radius;
       }

       public double getArea() {
              double area = Math.PI * Math.pow(radius, 2);
              return area;
       }

       public double getPerimeter() {
              double perimeter = 2 * Math.PI * radius;
              return perimeter;
       }

       @Override
       public String toString() {
              df.format(getArea());
              String str = super.toString() + "Luas Bangun Datar\t: " + df.format(getArea()) + "\nKelilingBangun Datar\t: "
              + df.format(getPerimeter()) + "\n";
              return str;
       }
       
}
