package PRAKTIKUM_8.LATIHAN_3;

public class Rectangle extends Shape {
       public double width = 1.0f;
       public double length = 1.0f;

       public Rectangle() {
       }

       public Rectangle(double width, double length) {
              this.width = width;
              this.length = length;
       }

       public Rectangle(double width, double length, String color, boolean field) {
              this.width = width;
              this.length = length;
              this.color = color;
              this.filled = filled;
       }

       public double getWidth() {
              return width;
       }

       public void setWidth(double width) {

              this.width = width;
       }

       public double getLength() {
              return length;
       }

       public void setLength(double length) {
              this.length = length;
       }

       public double getArea() {
              double area = length * width;
              return area;
       }

       public double getPerimeter() {
              double perimeter = (2 * length) + (2 * width);
              return perimeter;
       }

       @Override
       public String toString() {
              String str = super.toString() + "Luas Bangun Datar\t:" + df.format(getArea()) + "\nKeliling
              Bangun Datar\t:"

              + df.format(getPerimeter()) + "\n";
              return str;
       }

}
