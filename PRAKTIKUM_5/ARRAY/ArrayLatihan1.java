package PRAKTIKUM_5.ARRAY;

import java.util.Scanner;

public class ArrayLatihan1 {
      public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

              System.out.print("Jumlah Data : "); 
              int b = input.nextInt();
              int[] bilangan;
              bilangan = new int[b];

              for(int i = 0; i < bilangan.length; i++){
                     System.out.print("data ke - " + (i+1) +" = ");
                     bilangan[i] = input.nextInt();
              }
              for(int j = 0; j < bilangan.length; j++){
                     System.out.println("Hasil nilai[" + j + "] = " + bilangan[j]);
              }
              input.close();
      } 
}
