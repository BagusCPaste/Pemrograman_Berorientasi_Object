package PRAKTIKUM_8.LATIHAN_OVERRIDING;

public class Elang extends Hewan{
       void Suara()
       {
              System.out.println(" Suara\t\t : ngik...");
       }
       void Berjalan() 
       {
              System.out.println(" Terbang\t\t : Sayap ... ");
       }
       void Bernafas()
       {
              System.out.println(" Bernaffas\t\t : Menggunakan Paru - paru.... ");
       }
       void cetak()
       {
              jenis = "Burung";
              ciri = "kuku tajam";
              System.out.println("\nElang ");
              System.out.println("Jenis\t\t : "+jenis);
              System.out.println("Ciri\t\t : "+ciri);
              Suara();
              Berjalan();
              Bernafas();
       }
}
