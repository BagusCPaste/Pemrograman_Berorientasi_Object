package UTS;

import java.util.Scanner;

 class Gro {
       int kdProduk;
       double hrgJual, hrgBeli;
       String nmProduk;
   
       Scanner in = new Scanner(System.in);
   
       public void inputProduk() {
           System.out.print("Masukan Kode Produk : ");
           kdProduk = in.nextInt();
           System.out.print("Masukan Nama Produk : ");
           nmProduk = in.next();
           System.out.print("Masukan Harga Beli  : ");
           hrgBeli = in.nextDouble();
       }
}
public class Grosir1 extends Produk {
    int noNota, jmlJual, jnsByr;
    String ketByr, souvner;
    double totJual, ppn, bunga, totByr;


    
    public Grosir1(String Cabang) {
    }

       public void setNota() {
              System.out.print("Masukan No Nota : ");
              noNota = in.nextInt();
       }

       public void inpJumlah() {
              System.out.print("Masukan Jumlah Jual : ");
              jmlJual = in.nextInt();
              totJual = jmlJual * getHargaJual();
       }

       public double getHargaJual() {
              if (hrgBeli > 200000) {
              return hrgJual = hrgBeli + (0.1 * hrgBeli);
              } else if (hrgBeli > 100000 && hrgBeli <= 200000) {
              return hrgJual = hrgBeli + (0.15 * hrgBeli);
              } else if (hrgBeli > 50000 && hrgBeli <= 100000) {
              return hrgJual = hrgBeli + (0.2 * hrgBeli);
              } else if (hrgBeli > 25000 && hrgBeli <= 50000) {
              return hrgJual = hrgBeli + (0.3 * hrgBeli);
              } else {
              return hrgJual = hrgBeli + (0.5 * hrgBeli);
              }
       }

       public void inputJenis() {
              int tempo;
              System.out.print("Masukan Jenis Bayar [1. Cash / 2. Tempo]: ");
              jnsByr = in.nextInt();
              if (jnsByr == 1) {
              ketByr = "Cash";
              ppn = 0.11 * totJual;
              bunga = 0;
              }
              if (jnsByr == 2) {
              ketByr = "Tempo";
              System.out.print("Masukan Waktu tempo (Dalam Minggu) : ");
              tempo = in.nextInt();
              ppn = 0.11 * totJual;
              if (tempo > 2) {
                     ketByr = "-";
                     bunga = 0.5 * totJual;
              }
              }
       }

       public String Souvenir() {
              if (jnsByr == 1) {
              if (totByr >= 100000 && totByr <= 500000) {
                     return souvner = "Mangkok";
              } else if (totByr > 500000 && totByr <= 750000) {
                     return souvner = "Payung";
              } else if (totByr > 750000 && totByr <= 1000000) {
                     return souvner = "Tas Belanja";
              } else if (totByr > 1000000) {
                     return souvner = "Voucher 100rb";
              } else {
                     return souvner = "Tidak Ada";
              }
              } else {
              return souvner = "Tidak Ada";
              }
       }

       public double hitungJual() {
              return totByr = totJual + ppn + bunga;
       }

       public void cetak() {
              System.out.println(
                     noNota + "\t" + kdProduk + "\t" + nmProduk + "\t" + hrgBeli + "\t" + getHargaJual() + "\t"
                            + jmlJual
                            + "\t" + totJual + "\t" + ketByr + "\t" + ppn + "\t" + bunga + "\t" + hitungJual()
                            + "\t" + Souvenir());
       }
       import java.util.Scanner;

public class GrosirDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Masukan Jumlah Order Grosir : ");
        n = in.nextInt();
        Grosir[] a = new Grosir[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Grosir("SOLO");
            a[i].setNota();
            a[i].inputProduk();
            System.out.println("Harga Jual  : " + a[i].getHargaJual());
            a[i].inpJumlah();
            System.out.println("Total       : " + a[i].totJual);
            a[i].inputJenis();
            System.out.println("Ket Bayar   : " + a[i].ketByr);
            System.out.println("PPN         : " + a[i].ppn);
            System.out.println("Bungan      : " + a[i].bunga);
            System.out.println("Total Bayar  : " + a[i].to);
        }
        System.out.println("Daftar Grosir Toko Melati");
        System.out.println("==========================");
        System.out.println(
                "No Nota\tKode Produk\tNama Produk\tHarga Beli\tHarga Jual\tJumlah Jual\tTotal Jual\tKet Bayar\tPPN\tBUNGA\tTOTAL BAYAR\tSOUVENIR");
        for (int j = 0; j < n; j++) {
            a[j].cetak();
        }

    }
}
}