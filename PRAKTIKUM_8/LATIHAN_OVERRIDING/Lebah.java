package PRAKTIKUM_8.LATIHAN_OVERRIDING;

public class Lebah extends Hewan {
       void Suara()
       {
              System.out.println(" Suara\t\t : ngengnenge...");
       }
       void Berjalan() 
       {
              System.out.println(" Berjalan\t\t : sayap ... ");
       }
       void Bernafas()
       {
              System.out.println(" Bernafas\t\t : Menggunakan trakea.... ");
       }
       void cetak()
       {
              jenis = "Serangga";
              ciri = "ngentop";
              System.out.println("\nLebah ");
              System.out.println("Jenis\t\t : "+jenis);
              System.out.println("Ciri\t\t : "+ciri);
              Suara();
              Berjalan();
              Bernafas();
       }
}
