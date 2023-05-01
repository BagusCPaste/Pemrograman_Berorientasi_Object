package PRAKTIKUM_6.transportasi;

public class Mobil {
       public String nama;
       private int roda;
       private int mesin;

       public void maju()
       {
              System.out.println("Maju.....");
       }

       public void mundur()
       {
              System.out.println("Mundur.....");
       }

       public void belok()
       {
              System.out.println("Belok.....");
       }

       public void hidup(String nama)
       {
              System.out.println("Hidupkan Mobil " + this.nama );
       }

       public void ubah(String nama)
       {
              System.out.println("Ubah Gigi Mobil " + this.nama );
       }

       public void mati(String nama)
       {
              System.out.println("Matikan Mobil " + this.nama );
       }
       
       public int getRoda() {
              return roda;
       }

       public void setRoda(int roda) {
              this.roda = roda;
       }

       public int getMesin(){
              return mesin;
       }

       public void setMesin(int mesin) {
              this.mesin = mesin;
       }
              
}
