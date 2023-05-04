package LATIHAN_UTS;

import java.util.Scanner;

public class iklan {

       String nmIklan;
       int tarifIklan,kodeIklan,kodeProduk;
       void inputIklan(){
              Scanner input = new Scanner(System.in);
              System.out.print("Kode Iklan  :    ");
              kodeIklan = input.nextInt();
              System.out.print("Nama Iklan  :   ");
              nmIklan = input.nextLine();
              System.out.print("Tarif Iklan :  ");
              tarifIklan = input.nextInt();
       }
}
