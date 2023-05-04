package PRAKTIKUM_7.LATIHAN_2;

import java.util.Scanner;

public class Karyawan {
       public int sts_peg;

       public void inputKar() {
              Scanner sc = new Scanner(System.in);
              System.out.println("Jenis Karyawan");
              System.out.println("1. Karyawan Tetap");
              System.out.println("2. Karyawan Kontrak");
              System.out.print("Pilihan [1-2] = ");
              sts_peg = sc.nextInt();
       }
}
