package LATIHAN_UTS;

import java.util.Scanner;

public class PasangIklanDemo {
       public static void main(String[] args) {
              int jumlah,i,total = 0;
              Scanner input = new Scanner(System.in);
              System.out.println("||||=====Jasa Pemasangan Iklan Cetak=====||||");
              System.out.println("||||    Nama Agen : Muh Bagus Saputro    ||||");
              System.out.println("||||=====================================||||");
              System.out.println("");
              System.out.print("Masukkan Jumlah Pemesanan Iklan = ");
              jumlah = input.nextInt();
              PasangIklan htng [] = new PasangIklan[jumlah];

              for(i=0;i<jumlah;i++){
                     htng[i] = new PasangIklan();
                     System.out.println("Iklan ke "+(htng[i].noNota=i+1));
                     System.out.println("No Nota = "+(htng[i].noNota=i+1));
                     htng[i].setNota();
                     htng[i].inputJumlah();
                     htng[i].getTarifIklan();
                     htng[i].inputDurasi();
                     htng[i].getDiskon();
                     htng[i].getBiayaIklan();
                     htng[i].getSouvenir();
                     htng[i].getTotal();
                     total = total + htng[i].totBiaya;
                     System.out.println("");
                     System.out.println("");
              }

              System.out.println("Daftar Iklan Cetak <Muh Bagus Saputro> ");
              System.out.println(" -------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println("No      Nota        Produk Iklan         Tarif         Jumlah/Luas           Durasi              PPN           Total Biaya           Souvenir");
              System.out.println(" -------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println("");

              for(i=0;i<jumlah;i++){
                     int no_pst = i+1;
                     System.out.print(""+no_pst+" ");
                     htng[i].cetak();
              }

              System.out.println(" -------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println(" -------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.print("Total Semua Biaya "+total);
              System.out.println("");
       }
}
