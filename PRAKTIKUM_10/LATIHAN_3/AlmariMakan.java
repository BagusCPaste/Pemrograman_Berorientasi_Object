package PRAKTIKUM_10.LATIHAN_3;

public class AlmariMakan extends Almari {
       int jmlRoda;

       public void setJmlRoda(int jmlRoda) {
              this.jmlRoda = jmlRoda;
       }

       public void discount(int harga) {
              this.harga = this.harga - (this.harga * 10 / 100);
              System.out.println("Harga setelah diskon 10%: " + this.harga);
       }
}