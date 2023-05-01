//LATIHAN KONVERSI WAKTU

package PRAKTIKUM_4.LATIHAN3;

import java.util.Scanner;

public class KonversiWaktu {
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              int second;
              char lanjut;
              do {
                     System.out.print(" Masukan Detik : ");
                     second = input.nextInt();
                     conversion(second);
                     System.out.print(" Input Data lagi? [Y/T] : ");
                     lanjut = input.next().charAt(0);
              }while(lanjut == 'Y' || lanjut == 'y');
       }

       static void conversion(int second){
              int day, hour, minute;
              minute =  second/60;
              hour = (minute)/60;
              day = hour/24;
              System.out.println(" Hari   : "+ day);
              System.out.println(" Jam   : "+ hour);
              System.out.println(" Menit   : "+ minute);

       }
       
}
