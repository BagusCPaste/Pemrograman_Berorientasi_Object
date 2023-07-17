package PRAKTIKUM_8.LATIHAN_2;

public class TesPesawat {
       public static void main(String[] args) {
              Pesawat p = new Pesawat();
              PesawatTempur pt = new PesawatTempur();
              p.terbang();
              p.mendarat();

              System.out.println("..Air asia...");
              p.terbang();
              pt.terbang();
              pt.mendarat();
              pt.manuver();
       }
}
