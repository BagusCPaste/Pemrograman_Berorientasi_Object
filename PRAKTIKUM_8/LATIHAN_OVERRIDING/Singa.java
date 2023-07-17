package PRAKTIKUM_8.LATIHAN_OVERRIDING;

public class Singa extends Hewan {

       void Suara()
       {
              System.out.println(" Suara\t\t : meonggg...");
       }
       void Berjalan() 
       {
              System.out.println(" Berjalan\t\t : Berkaki empat ... ");
       }
       void Bernafas()
       {
              System.out.println(" Bernaffas\t\t : Menggunakan Paru - paru.... ");
       }
       void cetak()
       {
              jenis = "mamalia";
              ciri = "Karnivora";
              System.out.println("\nSinga ");
              System.out.println("Jenis\t\t : "+jenis);
              System.out.println("Ciri\t\t : "+ciri);
              Suara();
              Berjalan();
              Bernafas();
       }
}
