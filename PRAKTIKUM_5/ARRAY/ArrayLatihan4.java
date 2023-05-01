package PRAKTIKUM_5.ARRAY;

import java.util.Scanner;

public class ArrayLatihan4 {

       public static void penjumlahan(int[][] a, int[][] b, int barisA, int
              kolomA, int barisB, int kolomB) {
              int[][] sum = new int[barisA][kolomA];
              if (kolomA == kolomB || barisA == barisB) {
                     for (int i = 0; i < barisA; i++) {
                            for (int j = 0; j < kolomA; j++) {
                                   sum[i][j] = a[i][j] + b[i][j];
                            }
                     }
                     System.out.println("\nHASIL PENJUMLAHAN");
                     printMatrix(sum, barisA, kolomA);
              } else {
                     System.out.println("ROW OR COLUMN NOT EQUALS!!");

              }
       }

       public static void perkalian(int[][] a, int[][] b, int barisA, int kolomA, 
              int barisB, int kolomB) {
              int[][] sum = new int[barisA][kolomB];
              if (kolomA == barisB) {
                     for (int i = 0; i < barisA; i++) {
                            for (int j = 0; j < kolomB; j++) {
                                   for (int k = 0; k < kolomA; k++) {
                                          sum[i][j] += a[i][k] * b[k][j];
                                   }
                            }
                     }
                     printMatrix(sum, barisA, kolomB);
              } else {
                     System.out.println("Error! kolom matriks 1 != baris matriks 2");
              }
       }

       // menu transpose
       public static void transposeMenu(int[][] a, int[][] b, int barisA, int kolomA,int barisB, int kolomB) {
              Scanner scanner = new Scanner(System.in);
              System.out.println("\nMana yang ingin di Transpose?");
              System.out.println("1. Matriks A");
              System.out.println("2. Matriks B");
              System.out.println("3. Matriks A + B");
              System.out.print("\nPilihan [1-3]? : ");
              int pilihan = scanner.nextInt();
              int[][] sum;
              if (pilihan == 1) {
                     System.out.println("Hasil transpose A");
                     transpose(a, barisA, kolomA);
              } else if (pilihan == 2) {
                     System.out.println("Hasil transpose B");
                     transpose(b, barisB, kolomB);
              } else if (pilihan == 3) {
                     sum = new int[barisA][kolomA];
                     if (kolomA == kolomB || barisA == barisB) {
                            for (int i = 0; i < barisA; i++) {
                                   for (int j = 0; j < kolomA; j++) {
                                          sum[i][j] = a[i][j] + b[i][j];
                                   }
                            }
                            printMatrix(sum, barisA, kolomA);
                            System.out.println("Hasil transpose");
                            transpose(sum, barisA, kolomA);
                     } else {
                            System.out.println("ROW OR COLUMN NOT EQUALS!!");
                     }
              }
       }

       private static void transpose(int[][] arr, int row, int column) {
              int[][] sum = new int[row][column];
              for (int i = 0; i < row; ++i) {
                     for (int j = 0; j < column; ++j) {
                            sum[j][i] = arr[i][j];
                     }
              }
              printMatrix(sum, row, column);
       }
              
       private static void printMatrix(int[][] arr, int row, int column) {
              for (int i = 0; i < row; i++) {
                     for (int j = 0; j < column; j++) {
                            System.out.print(arr[i][j] + "\t");
                            if (j == column - 1) {
                                   System.out.println();
                            }
                     }
              }
       }
}
