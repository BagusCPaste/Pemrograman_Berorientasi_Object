package PRAKTIKUM_8.LATIHAN_3;

public class Square extends Rectangle {
       public double side;

       public Square() {
       }

       public Square(double side) {
              super(side, side);
       }

       public Square(double side, String color, boolean filled) {
              super(side, side, color, filled);

       }

       public double getSide() {
              return getWidth();
       }

       public void setSide(double side) {
              setWidth(side);
              setLength(side);
       }

       public void setWidth(double width) {
              super.setWidth(side);
       }

       public void setLength(double length) {
              super.setLength(side);
       }

       @Override
       public String toString() {
              String str = super.toString() + "Panjang Sisi\t\t:" + getSide() + "\n";
              return str;
       }
}
