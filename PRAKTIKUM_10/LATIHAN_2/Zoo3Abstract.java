package PRAKTIKUM_10.LATIHAN_2;

public class Zoo3Abstract {
       static void test(Binatang a) {
              a.makan();
              a.tidur();
              a.mati();
       }

       public static void main(String[] args) {
              Harimau h = new Harimau();
              Bebek b = new Bebek();
              test(h);
              test(b);
       }
}
