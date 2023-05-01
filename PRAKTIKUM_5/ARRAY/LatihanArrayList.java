package PRAKTIKUM_5.ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

public class LatihanArrayList {

       private ArrayList<Float> nilai1 = new ArrayList<Float>();
       private ArrayList<Float> nilai2 = new ArrayList<Float>();
       private ArrayList<Float> jumlah = new ArrayList<Float>();
       private Scanner scanner = new Scanner(System.in);
       
       public int inputJumlah() {
              System.out.print("Input jumlah data = ");
              int panjang = scanner.nextInt();
              return panjang;
       }

       public void isiData() {
              int maxIn = inputJumlah();
              float value;
              /*
              * isi data sesuai dengan jumlah
              * index yang ditentukan
              */
              System.out.println("\nNilai 1 ");
              for (int i = 0; i < maxIn; i++) {
                     System.out.print("Index ke " + i + " = ");
                     value = scanner.nextFloat();
                     nilai1.add(value);
              }
              System.out.println("\nNilai 2 ");
              for (int i = 0; i < maxIn; i++) {
                     System.out.print("Index ke " + i + " = ");
                     value = scanner.nextFloat();
                     nilai2.add(value);
                     /*
                     * numpang inisialisasi panjang
                     * ArrayList dari jumlah
                     */
                     jumlah.add(0f);
              }
       }

       public void penjumlahan() {
              for (int i = 0; i < jumlah.size(); i++) {
                     jumlah.set(i, nilai1.get(i) + nilai2.get(i));
              }
       }

       public void pengurangan() {
              for (int i = 0; i < jumlah.size(); i++) {
                     jumlah.set(i, nilai1.get(i) - nilai2.get(i));
              }
       }

       public void perkalian() {
              for (int i = 0; i < jumlah.size(); i++) {
                     jumlah.set(i, nilai1.get(i) * nilai2.get(i));
              }
       }

       public void pembagian() {
              for (int i = 0; i < jumlah.size(); i++) {
                     jumlah.set(i, nilai1.get(i) / nilai2.get(i));
              }
       }

       public void display() {
              for (int i = 0; i < jumlah.size(); i++) {
                     System.out.println("Jumlah index ke " + i + " = " + jumlah.get(i));
              }
       }

       public void resetValue() {
              if (nilai1.size() != 0) {
                     for (int i = 0; i < jumlah.size(); i++) {
                            nilai1.clear();
                            nilai2.clear();
                            jumlah.clear();
                     }
              }
       }
}
