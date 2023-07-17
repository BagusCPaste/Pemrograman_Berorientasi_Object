package PRAKTIKUM_8.Polymorphism;

public class Balok extends PersegiPanjang {
       double  t,volume;

       void HitungVolume()
       {
              volume = luas*t;
       }
       void cetak()
       {
              super.cetak();
              System.out.println("Tinggi\t : "+t);
              System.out.println("Tinggi\t : "+volume);
       }
       void cetak(String nama)
       {
              System.out.println("Balok\t : "+nama);
              cetak();
       }
       
}
