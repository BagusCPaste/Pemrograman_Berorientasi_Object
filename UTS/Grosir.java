package UTS;

import java.util.Scanner;

class Produk {
       String kdProduk, nmProduk;
       double hrgBeli, hrgJual;

       public void inputProduk() {
              Scanner input = new Scanner(System.in);

              System.out.print("Masukkan Kode Produk: ");
              kdProduk = input.nextLine();

              System.out.print("Masukkan Nama Produk: ");
              nmProduk = input.nextLine();

              System.out.print("Masukkan Harga Beli: ");
              hrgBeli = input.nextDouble();

              if (hrgBeli > 200_000) {
              hrgJual = (double)hrgBeli + (0.1 * hrgBeli);
              } else if (hrgBeli > 100_000) {
              hrgJual = (double)hrgBeli + (0.15 * hrgBeli);
              } else if (hrgBeli > 50_000) {
              hrgJual = (double)hrgBeli + (0.2 * hrgBeli);
              } else if (hrgBeli > 25_000) {
              hrgJual = (double)hrgBeli + (0.3 * hrgBeli);
              } else {
              hrgJual = (double)hrgBeli + (0.5 * hrgBeli);
              }
       }

        double getHargaJual() {
              return hrgJual;
       }

}

public class Grosir extends Produk {
       String cabang, noNota, jnsByr, ketByr, souvenir;
       int jmlJual, waktuTempo;
       double totJual, ppn, bunga, totByr;

       public Grosir(String cabang) {
              this.cabang = cabang;
       }

       public void setNota() {
              Scanner input = new Scanner(System.in);

              System.out.print("Masukkan No. Nota: ");
              noNota = input.nextLine();
       }

       public void inputJumlah() {
              Scanner input = new Scanner(System.in);

              System.out.print("Masukkan Jumlah Jual: ");
              jmlJual = input.nextInt();

              totJual = jmlJual * getHargaJual();
       }

       public  void inputJenis() {
              Scanner input = new Scanner(System.in);

              System.out.print("Masukkan Jenis Bayar (1. Cash / 2. Tempo): ");
              int jenisBayar = input.nextInt();

              switch (jenisBayar) {
              case 1:
                     jnsByr = "Cash";
                     ketByr = "-";
                     ppn = (double)0.11 * totJual;
                     bunga = 0;
                     totByr = totJual + ppn;
                     break;
              case 2:
                     jnsByr = "Tempo";
                     System.out.print("Masukkan Waktu Tempo (dalam minggu): ");
                     waktuTempo = input.nextInt();
                     ketByr = "Waktu Tempo: " + waktuTempo + " minggu";
                     ppn = (double)0.11 * totJual;
                     if (waktuTempo > 2) {
                     bunga = (double)0.05 * totJual;
                     } else {
                     bunga = 0;
                     }
                     totByr = totJual + ppn + bunga;
                     break;
              default:
                     System.out.println("Input tidak valid.");
                     break;
              }
       }
       public void hitungJual() {
              totJual = jmlJual * getHargaJual();
              ppn = (double)totJual * 0.11;
              totByr = totJual + ppn + (totJual * bunga);
       }
       public String getSouvernir() {
              if (totByr >= 100000 && totByr <= 500000) {
                  return "Mug";
              } else if (totByr <= 750000) {
                  return "Payung";
              } else if (totByr <= 1000000) {
                  return "Tas";
              } else {
                  return "Voucher 100rb";
              }
       }

       public void cetak()
       {
              
              System.out.println("Daftar Grosir <Muh Bagus Saputro> ");
              System.out.println(" -------------------------------------------------------------------------------------------------------------------------------------------------------");

              System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n",
                    "Nota", "kdProduk", "nmProduk", "hrgBeli", "hrgJual", "jmljual", "totJual", "jnsBayar", "ketBayar",
                    "Tempo", "PPN", "Bunga", "totBayar","Souvenir");
                    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n",
                    noNota,kdProduk,nmProduk,hrgBeli,getHargaJual(),jmlJual,totJual,jnsByr,ketByr,waktuTempo,ppn,bunga,totByr,getSouvernir());

       }
}
