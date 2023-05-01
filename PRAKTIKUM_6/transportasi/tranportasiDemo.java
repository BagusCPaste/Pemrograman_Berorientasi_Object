package PRAKTIKUM_6.transportasi;

public class tranportasiDemo {
       public static void main(String[] args) {
              Bicycle sepeda = new Bicycle();
              Mobil avanza = new Mobil();

              avanza.nama = "Avanza Silver";
              avanza.setRoda(4); 
              avanza.setMesin(1);
              avanza.hidup(avanza.nama);
              avanza.ubah(avanza.nama);
              avanza.maju();
              avanza.mundur();
              avanza.belok();
              sepeda.speed = 10;
              sepeda.gear = 2;
              sepeda.setGear(10);
              sepeda.setSpeed(7);

       }
}
