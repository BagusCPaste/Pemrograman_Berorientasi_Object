//LATIHAN DETERMINAN

package PRAKTIKUM_4.LATIHAN2;

import java.util.Scanner;

public class Determinan {
       static float a,b,c;
       static String nama;

      public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       char lanjut;
       do{
              System.out.print(" Determinan Siapa       : ");
              nama = input.next();
              System.out.print(" Nilai A      : ");
              a = input.nextFloat();
              System.out.print(" Nilai B      : ");
              b = input.nextFloat();
              System.out.print(" Nilai C      : ");
              c = input.nextFloat();
              abc(determinan(a,b,c));
              System.out.print(" Input Data lagi? [Y/T] : ");
              lanjut = input.next().charAt(0);
       }while(lanjut == 'Y' || lanjut == 'y');
      } 

      static float determinan(float a, float b, float c){
       
              return (b * b) - 4 * a * c;
      }

      static void abc(float det)
      {
              float x1 = 0, x2 = 0;
              if (det > 0) {
                     x1 = (float)(-b + (Math.sqrt(det)/(2*a)));
                     x2 = (float)(-b - (Math.sqrt(det)/(2*a)));
              }else if(det == 0){
                     x1 = x2 = -b/2*a;
              }else if(det < 0){
                     x1 = (float)((-b/(2*a)) + (Math.sqrt(-det)/(2*a)));
                     x2 = (float)((-b/(2*a))- (Math.sqrt(-det)/(2*a)));
              }
              System.out.println(" a      : "+a);
              System.out.println(" b      : "+b);
              System.out.println(" c      : "+c);
              System.out.println(" d      : "+det);
              System.out.println(" x1      : "+x1);
              System.out.println(" x2      : "+x2);

      }

}
