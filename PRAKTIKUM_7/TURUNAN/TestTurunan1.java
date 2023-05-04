package PRAKTIKUM_7.TURUNAN;

class Satu {
       Satu() {
              System.out.println("Satu....."+ "Kiriman untuk mbah buyut......");
       }
}

class Dua extends Satu {
       Dua() {
              System.out.println("Dua.....");
       }
}

class Tiga extends Dua {
       Tiga() {
              System.out.println("Tiga.....");
       }
}


class Empat extends Tiga {
       Empat() {
              System.out.println("Empat.....");
       }
}
public class TestTurunan1 {
       public static void main(String[] args) {
              new Tiga();
       }
}
