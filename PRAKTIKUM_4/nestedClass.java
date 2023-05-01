//NESTED CLASS LUAR DALAM

package PRAKTIKUM_4;

public class nestedClass {

       public static void main(String[] args) {
              Luar l = new Luar();
              Luar.Tengah t = l.new Tengah();
              Luar.Tengah.Dalam d = t.new Dalam();

              l.cetakLuar();
              t.cetakTengah();
              d.cetakDalam();

       }
       
}
class Luar {
       void cetakLuar(){
              System.out.println("cetak luar...");
              // cetakTengah();
              // cetakDalam();
       }
       class Tengah {
              void cetakTengah() {
                     System.out.println("cetak tengah...");
                     //cetakDalam();
              }
              class Dalam {
                     void cetakDalam() {
                            cetakLuar();
                            //cetakTengah();
                            System.out.println("cetak Dalam...");
                     }
              }
       }
}
