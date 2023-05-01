package PRAKTIKUM_5.ARRAY;

import java.util.Scanner;

public class MatrixDemo {

       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              boolean shouldBreak = false;
              System.out.print("Row Matrix A = ");
              int rowA = scanner.nextInt();
              System.out.print("Column Matrix A = ");
              int columnA = scanner.nextInt();
              // initialize index matrix A
              int[][] matrixA = new int[rowA][columnA];
              // fill the index of matrix A
              for (int i = 0; i < rowA; i++) {
                     for (int j = 0; j < columnA; j++) {
                            System.out.print("input index [" + i + "," + j + "] = ");
                            matrixA[i][j] = scanner.nextInt();
                     }
              }
              System.out.print("Row Matrix B = ");
              int rowB = scanner.nextInt();
              System.out.print("Column Matrix B = ");
              int columnB = scanner.nextInt();

              // initialize index matrix B
              int[][] matrixB = new int[rowB][columnB];

              // fill the index of matrix B
              for (int i = 0; i < rowB; i++) {
                     for (int j = 0; j < columnB; j++) {
                            System.out.print("input index [" + i + "," + j + "] = ");
                            matrixB[i][j] = scanner.nextInt();
                     }
              }
              while (true) {
                     System.out.println("\nMENU MATRIKS");
                     System.out.println("1. Penjumlahan matriks");
                     System.out.println("2. Perkalian matriks");
                     System.out.println("3. Transpose matriks");
                     System.out.println("4. Exit");
                     System.out.print("\nPilihan [1-4] ?: ");
                     int pilihan = scanner.nextInt();
                     switch (pilihan) {
                            case 1 -> ArrayLatihan4.penjumlahan(matrixA, matrixB, rowA, columnA, 
                            rowB,
                            columnB);
                            case 2 -> ArrayLatihan4.perkalian(matrixA, matrixB, rowA, columnA, 
                            rowB,
                            columnB);
                            case 3 -> ArrayLatihan4.transposeMenu(matrixA, matrixB, rowA, columnA,
                            rowB, columnB);
                            case 4 -> shouldBreak = true;
                            default -> System.out.println("Pilihan Tidak dimengerti!");
                     }
                     if (shouldBreak)
                            break;
              }
              scanner.close();
       }
}
