package PRAKTIKUM_7.LATIHAN_1;

public class Mobil2 {

       public String nama;
       private int roda = 4;
       public int body = 1;
       public int mesin = 1;
       public void maju() {
       System.out.println("Maju.....");
       }
       public void mundur() {
              System.out.println("Mundur.....");
       }

       public void belok() {
              System.out.println("Belok....");
       }
       public void hidupkanMobil() {
              System.out.println("Hidupkan Mobil : " + this.nama);
       }
       public void matikanMobil() {
              System.out.println("Matikan Moil : " + this.nama);
       }
       public void ubahGigi() {
              System.out.println("Ubah Gigi Mobil : " + this.nama);
       }
       public int getRoda() {
              return roda;
       }
       public void setRoda(int roda) {
              this.roda = roda;
       }
}
