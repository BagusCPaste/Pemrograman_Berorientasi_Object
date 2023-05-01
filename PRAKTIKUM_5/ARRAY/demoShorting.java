package PRAKTIKUM_5.ARRAY;

import java.util.Scanner;

public class demoShorting {
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.print("Jumlah Bilangan : ");
              int index = scanner.nextInt();
              int[] arr = new int[index];
              int[] arrReset = new int[index];
              boolean shouldBreak = false;
              System.out.print("Input bilangan : ");
              for (int i = 0; i < arr.length; i++) {
                     arr[i] = scanner.nextInt();
                     arrReset[i] = arr[i];
              }
              do {
                     System.out.println("PILIHAN SORTING");
                     System.out.println("1. bubble sort");
                     System.out.println("2. quick sort");
                     System.out.println("3. insertion sort");
                     System.out.println("4. selection sort");

                     System.out.println("5. merge sort");
                     System.out.println("6. keluar");
                     System.out.print("\nPilihan : ");
                     int choose = scanner.nextInt();
                     switch (choose) {
                            case 1 -> ArrayLatihan3.bubbleSort(arr);
                            case 2 -> ArrayLatihan3.quickSort(arr, 0, arr.length-1);
                            case 3 -> ArrayLatihan3.insertionSort(arr);
                            case 4 -> ArrayLatihan3.selectionSort(arr);
                            case 5 -> ArrayLatihan3.mergeSort(arr, 0, arr.length - 1);
                            case 6 -> shouldBreak = true;
                            default -> System.out.println("Pilihan Tidak dimengerti!");
              }
              // reset array to unsorted
              for (int i = 0; i < arr.length; i++) {
                     arr[i] = arrReset[i];
              }
              if (shouldBreak) 
              break;
              } while (true);
       }  
}
