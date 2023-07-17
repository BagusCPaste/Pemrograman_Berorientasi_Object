package PRAKTIKUM_8.LATIHAN_3;

import java.text.DecimalFormat;

public class Shape {
       String color;
       boolean filled;
       DecimalFormat df = new DecimalFormat("#.##");
       public Shape() {
       }
       public Shape(String color, boolean filled) {
              this.color = color;
              this.filled = filled;
       }
       public String getColor() {
              return color;
       }
       public void setColor(String color) {
              this.color = color;
       }
       public boolean isFilled() {
              return filled;
       }
       public void setFilled(boolean filled) {

              this.filled = filled;
       }
       @Override
       public String toString() {
              String str;
              if (isFilled()) {
                     str = "==============================\nWarna Bangun Datar\t:" + getColor() + "\n";
              } else {
                     str = "==============================\n";
              }
              return str;
       }
       
}
