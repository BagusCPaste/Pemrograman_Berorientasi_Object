package PRAKTIKUM_10.LATIHAN_3;

public class MejaTamu extends Meja implements Discountable {
       String bentukKaca;

       public void setBentukKaca(String bentukKaca) {
              this.bentukKaca = bentukKaca;
       }

       public void discount(int harga) {
              this.harga = this.harga - (this.harga * 10 / 100);
              System.out.println("Harga setelah diskon 10%: " + this.harga);
       }

       public int getHarga() {
              return this.harga;
       }
}
