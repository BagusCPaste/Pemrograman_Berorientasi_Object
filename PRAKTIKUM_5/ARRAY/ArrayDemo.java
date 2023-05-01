package PRAKTIKUM_5.ARRAY;

import java.util.Scanner;

public class ArrayDemo {

       public static void main(String[] args) {
              LatihanArrayList test = new LatihanArrayList();
              boolean shouldBreak = false;
              while (true) {
                     System.out.println("\nMENU ARRYALIST");
                     System.out.println("1. Isi Data");
                     System.out.println("2. Penjumlahan");
                     System.out.println("3. Pengurangan");
                     System.out.println("4. Perkalian");
                     System.out.println("5. Pembagian");
                     System.out.println("6. Exit");

                     Scanner scanner = new Scanner(System.in);
                     System.out.print("\nPilihan [1-6]? = ");
                     int pilihan = scanner.nextInt();

                     switch (pilihan) {
                            case 1 -> {
                                   test.resetValue();
                                   test.isiData();
                            }
                            case 2 -> {
                                   test.penjumlahan();
                                   System.out.println("\nHASIL PENJUMLAHAN");
                                   test.display();
                            }
                            case 3 -> {
                                   test.pengurangan();
                                   System.out.println("\nHASIL PENGURANGAN");
                                   test.display();
                            }
                            case 4 -> {
                                   test.perkalian();
                                   System.out.println("\nHASIL PERKALIAN");
                                   test.display();
                            }
                            case 5 -> {
                                   test.pembagian();
                                   System.out.println("\nHASIL PEMBAGIAN");
                                   test.display();
                            }
                            case 6 -> shouldBreak = true;
                            default -> System.out.println("\nInputan Tidak sesuai!\n");
                     }scanner.close();

                     if (shouldBreak)
                     break;
              }
       }
}
