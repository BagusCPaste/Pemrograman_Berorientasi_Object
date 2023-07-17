package UTS;

import java.util.Scanner;

public class ProdukDemo {
      public static void main(String[] args) {
              String pilihan = "Y";
              Grosir gg = new Grosir("Pati");
              while(pilihan.equals("Y")){
                     gg.inputProduk();
                     gg.inputJumlah();
                     gg.hitungJual();
                     gg.inputJenis();
                     gg.setNota();
                     gg.getHargaJual();
                     gg.getSouvernir();
                     gg.cetak();
                     System.out.println("Mau Lanjut Apa Tidak (Y/T) ?");
                     Scanner scanner = new Scanner(System.in);
                     pilihan = scanner.nextLine().toUpperCase();

              }

           
           
              

       }
 
}

