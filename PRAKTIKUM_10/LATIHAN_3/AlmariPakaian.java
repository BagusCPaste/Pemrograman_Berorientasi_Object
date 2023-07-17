package PRAKTIKUM_10.LATIHAN_3;

public class AlmariPakaian extends Almari implements Discountable {
       int jmlPintu;

       public void setJmlPintu(int jmlPintu) {
              this.jmlPintu = jmlPintu;
       }

       public void discount(int harga) {
              this.harga = this.harga - (this.harga * 10 / 100);
              System.out.println("Harga setelah diskon 10%: " + this.harga);
       }
}
