//LATIHAN PENJUALANA

package PRAKTIKUM_4.LATIHAN1;

import java.util.Scanner;

public class Penjualan {

       static Scanner input = new Scanner(System.in);
       static String kode,nama;
       static float harga,total;
       static int jumlah;
       static char lanjut;

       public static void main(String[] args) {
              do{

                     setData();
                     getTotalPembayaran();
                     getBonus();
                     cetakNota();
                     System.out.print(" Input Data lagi? [Y/T] : ");
                     lanjut = input.next().charAt(0);
              }while(lanjut == 'Y' || lanjut == 'y');
       }

       static void getTotalPembayaran()
       {
              System.out.println(" Total pembelian : Rp " + total +"\n");
       }

       static void setData()
       {
              System.out.print(" Kode :  ");
              kode = input.next();
              System.out.print(" Nama : ");
              nama = input.next();
              System.out.print(" Harga : ");
              harga = input.nextFloat();
              System.out.print(" Jumlah : ");
              jumlah = input.nextInt();
              total = harga * jumlah;
       }
       static void getBonus()
       {
              if (total >= 500000 && jumlah > 5) {
                     System.out.println(" Anda Mendapatkan Setrika! ");
              }else if (total >= 100000 && jumlah > 3) {
                     System.out.println(" Anda Mendapatkan Payung!");
              }else if (total >= 50000 && jumlah > 2) {
                     System.out.println(" Anda Mendapatkan BallPoint!");
              }else{
                     System.out.println(" Anda uran Beruntung!");
              }
       }
       static void cetakNota()
       {
              System.out.println("\n============ Nota Pembayaran =============");
              System.out.println(" Kode   : "+kode);
              System.out.println(" Nama   :"+nama);
              System.out.println(" Harga  : Rp"+harga);
              System.out.println(" Jumlah : "+jumlah);
              System.out.println(" Total  : Rp"+total);

       }
}
