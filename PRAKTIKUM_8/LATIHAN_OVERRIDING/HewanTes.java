package PRAKTIKUM_8.LATIHAN_OVERRIDING;

import java.util.Scanner;

public class HewanTes {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Boolean next = true;

       while (next) {
              System.out.println("\nMenu");
              System.out.println(" 1. Singa");
              System.out.println(" 2. Elang");
              System.out.println(" 3. Lebah");
              System.out.println(" 4.Paus");
              System.out.println(" 5. Exit");
              System.out.print("Masukan Angka [1-5] : ");
              int pilihan = sc.nextInt();

              switch (pilihan) {
                     case 1 ->
                     {
                            Singa singa = new Singa();
                            singa.cetak();
                     }
                     case 2 ->
                     {
                            Elang elang = new Elang();
                            elang.cetak();
                     }
                     case 3 ->
                     {
                            Lebah lebah = new Lebah();
                            lebah.cetak();
                     }
                     case 4 ->
                     {
                            Paus paus= new Paus();
                            paus.cetak();
                     }
                     case 5 ->
                     {
                            next = false;
                     }
              
                     default-> System.out.println(" Coba Lagi");
              }
       }
     }  
}
