package PRAKTIKUM_6.TestJAR.Mobil;

public class Mobil {
       private int roda=4;
       private int body=1;
       
       //kalo di private nanti gabisa di akses di class lain caranya pake setter getter
       static int mesin=1;


       public static void maju(){
              System.out.println("Maju.....");
       }
       public void mundur(){
              System.out.println("Mundur.....");
       }
       void belok(){
              System.out.println("Belok.....");
       }
       void hidupkanMobil(String nama){
              System.out.println("Hidupkan Mobil : "+nama);
       }
       static void matikanMobil(String nama){
              System.out.println("Matikan Mobil : "+nama);
       }
       static void ubahGigi(String nama){
              System.out.println("Ubah Gigi Mobil : "+nama);
       }
      
       void setRoda(int roda){
              this.roda=roda;
       }
       int getRoda(){
              return roda;
       }
       void setBody(int body){
              this.body=body;
       }

       int getBody(){
              return body;
       }
}
