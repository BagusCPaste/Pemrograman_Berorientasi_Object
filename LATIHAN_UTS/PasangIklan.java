package LATIHAN_UTS;

import java.util.Scanner;

public class PasangIklan extends iklan{
       Scanner input = new Scanner(System.in);
       int noNota,potongan,jmlIklan,biayaIklan,durasi,totBiaya,ppn;
       float diskon,jmldiskon;
       String ketByr,souvenir;
       String nama,alamat,cabang;
       
       void PasangIklan(String cabang){
              this.cabang = cabang;
       }

       void setNota(){
              System.out.print("Nama Pemasang  : ");
              nama=input.next();
              System.out.print("Alamat         : ");
              alamat = input.next();
              System.out.println("======Melayani Produk Iklan======");
              System.out.println("[ 1.Iklan Baris]");
              System.out.println("[ 2.Iklan Display]");
              System.out.print("Kode Produk (pilih 1 atau 2) : ");
              kodeProduk = input.nextInt(); 
              this.kodeProduk=kodeProduk;
       }

       void inputJumlah(){
              if(kodeProduk==1){
                     System.out.print("Produk Iklan   : 1.Iklan Baris");
                     System.out.print("\nJumlah Baris   : ");
                     jmlIklan = input.nextInt();
              
              }else if (kodeProduk==2){
                     System.out.print("Produk Iklan   : 2.Iklan Display");
                     System.out.print("\nLuas(mmk)      : ");
                     jmlIklan = input.nextInt();

              }else{
                     System.out.println("Pilihan Tidak Tersedia");
              }
       }

       void getTarifIklan(){
              switch(kodeProduk){
                     case 1 : tarifIklan = 20000;
                            break;
                     case 2 : tarifIklan = 25000;
                            break;
              }
              System.out.print("Tarif Iklan    : Rp."+tarifIklan);  
       }

       void inputDurasi(){
              System.out.print("\nDurasi (hari)  : ");
              durasi = input.nextInt();
       }

       int getDiskon(){
              System.out.print("Diskon(%)      : ");
              diskon = input.nextInt();
              potongan =(int)(diskon/100*tarifIklan*jmlIklan*durasi);
              System.out.println("Hasil Potongan : Rp."+potongan);

              return potongan;
       }

       int getBiayaIklan(){
              biayaIklan=(tarifIklan*jmlIklan*durasi-potongan);
              System.out.print("Biaya Iklan    : Rp."+biayaIklan);
              
              return biayaIklan;
       }

       String getSouvenir(){
       if (kodeProduk==1){ 
              souvenir ="Tidak Mendapat Souvenir";

       }else if(durasi<3){
              souvenir="Tidak mendapatkan Souvenir";

       }else if((durasi>=3)&&(durasi<=6)){
              souvenir="Mug Cantik";

       }else if((durasi>=7)&&(durasi<=10)){
              souvenir="Payung Cantik";

       }else if((durasi>=11)&&(durasi>=14)){
              souvenir="Tas Keren";
       }
              return souvenir;
       }
       
       int getTotal(){
              ppn =(int) (0.1 * biayaIklan);
              System.out.println("\nPPN            : Rp."+ppn);
              totBiaya=ppn+biayaIklan;
              System.out.println("Total Biaya    : Rp."+totBiaya);
              System.out.println("Bonus Souvenir : "+souvenir);
              
              return totBiaya;
       }

       void cetak(){
              System.out.println("\t"+noNota+"\t\t"+kodeProduk+"\t\t"+tarifIklan+"\t\t"+jmlIklan+"\t\t\t"+durasi+"\t\t"+ppn+"\t\t"+totBiaya+"\t\t"+souvenir);
       
       }
       
}
