// CODE LINGKARAN ( MENGGUNAKAN CLASS DAN OBJEK )

package PRAKTIKUM_2;

class  mobil{

 

    int roda = 4;
    int body = 1;

     int mesin = 1; //class variabel

     void maju(){
        System.out.println(" Maju.........");
    }
     void mundur(){
        System.out.println(" mundur.......");
    }
     void belok(){
        System.out.println(" belok........");
    }
    void SetRoda(int roda){
        this.roda = roda;
    }
    int GetRoda(){
        return roda;
    }
    void SetBody(int body){
        this.body = body;
    }
    int GetBody(){
        return body;
    }
}
class mobil2{
     void HidupkanMobil(String nama){
        System.out.println("Hidupkan Mobil "+nama);
    }
     void MatikanMobil(String nama){
        System.out.println("Matikan Mobil "+nama);
    }
     void UbahGigi(String nama,int gigi){
        System.out.println("Sudah Mengubah Gigi Mobil "+nama+" Ke "+gigi);
    }
}

public class lat1_mobil {
    public static void main(String[] args) {
        String mobilku[] ={"Civic Turbo Type-R","Innova Reborn","Marcedes Bend"};

        mobil avanza = new mobil();
        mobil xenia = new mobil();
        mobil2 pajero = new mobil2();
        mobil2 inova = new mobil2();


        avanza.maju();
        avanza.mundur();
        avanza.belok();

        System.out.println(" Roda      : " +avanza.roda);
        System.out.println(" Mesin     : " +avanza.mesin);
        System.out.println(" Roda      : " +avanza.GetRoda());
        System.out.println(" Mesin     : " +avanza.GetBody());

        xenia.maju();
        xenia.mundur();
        xenia.belok();

        System.out.println(" Roda       : " +xenia.roda);
        System.out.println(" Mesin      : " +xenia.mesin);
        System.out.println(" Roda       : " +xenia.GetRoda());
        System.out.println(" Mesin      : " +xenia.GetBody());

        pajero.HidupkanMobil(mobilku[1]);
        pajero.UbahGigi(mobilku[0],2);

        inova.HidupkanMobil(mobilku[0]);
        inova.UbahGigi(mobilku[0],1);

    }
}
