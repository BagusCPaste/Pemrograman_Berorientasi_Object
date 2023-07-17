package PRAKTIKUM_8.LATIHAN_OVERRIDING;

public class Paus extends Hewan {
       void Suara()
       {
              System.out.println(" Suara\t\t : tieiiewit...");
       }
       void Berjalan() 
       {
              System.out.println(" Berjalan\t\t : Berenang ... ");
       }
       void Bernafas()
       {
              System.out.println(" Bernaffas\t\t : Menggunakan Paru - paru.... ");
       }
       void cetak()
       {
              jenis = "mamalia";
              ciri = "ganas dek kayak kamu";
              System.out.println("\nPaus ");
              System.out.println("Jenis\t\t : "+jenis);
              System.out.println("Ciri\t\t : "+ciri);
              Suara();
              Berjalan();
              Bernafas();
       }
}
