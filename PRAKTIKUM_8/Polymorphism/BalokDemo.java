package PRAKTIKUM_8.Polymorphism;

public class BalokDemo {
       public static void main(String[] args) {
              Balok balok = new Balok();
              balok.p = 10;
              balok.l =5;
              balok.t = 5;
              balok.HitungLuas();
              balok.HitungVolume();
              balok.cetak();
              System.out.println("");
              balok.p = 7;
              balok.HitungVolume();
              balok.cetak("Balokku");
       }
       
}
