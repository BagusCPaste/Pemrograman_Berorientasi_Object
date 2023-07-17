package PRAKTIKUM_8.LATIHAN_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Shapedemo {
       public static void main(String[] args) throws IOException {
              int bentuk, angka1, angka2;
              String warna = "";
              boolean fill;
              BufferedReader inpStr = new BufferedReader(new InputStreamReader(System.in));
              Scanner inpNum = new Scanner(System.in);
              System.out.println("SHAPE PROGRAM");
              System.out.println("1. Lingkaran");
              System.out.println("2. Persegi Panjang");
              System.out.println("3. Persegi");
              System.out.println("=====================");
              System.out.print("Masukkan pilihan\t: ");
              bentuk = inpNum.nextInt();

              if ((1 <= bentuk) && (bentuk <= 3)) {
                     System.out.print("Berwarna [True / False]\t: ");
                     fill = inpNum.nextBoolean();
                     if (fill) {
                            System.out.print("Masukkan warna\t\t: ");
                            warna = inpStr.readLine();
                     }
                     if (bentuk == 1) {
                            System.out.print("Masukkan radius\t: ");
                            angka1 = inpNum.nextInt();
                            Circle cr = new Circle(angka1, warna, fill);
                            System.out.print(cr);
                     } else if (bentuk == 2) {
                            System.out.print("Masukkan panjang\t: ");
                            angka1 = inpNum.nextInt();
                            System.out.print("Masukkan lebar\t: ");
                            angka2 = inpNum.nextInt();
                            Rectangle rc = new Rectangle(angka1, angka2, warna,
                                          fill);
                            System.out.print(rc);
                     } else if (bentuk == 3) {
                            System.out.print("Masukkan panjang sisi\t: ");
                            angka1 = inpNum.nextInt();
                            Square sq = new Square(angka1, warna, fill);
                            System.out.print(sq);
                     }
              } else {
                     System.out.println("Inputan tidak sesuai!!");
              }
       }

}
