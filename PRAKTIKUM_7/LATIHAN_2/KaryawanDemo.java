package PRAKTIKUM_7.LATIHAN_2;
import java.io.IOException;
import java.text.DecimalFormat;


public class KaryawanDemo {
       public static void main(String[] args) throws IOException {

              String pattern = "###,###.###";
              DecimalFormat df = new DecimalFormat("###,###,##0.00");
              Karyawan kar = new Karyawan();
              KaryawanTetap tetap = new KaryawanTetap();
              KaryawanKontrak kontrak = new KaryawanKontrak();
              kar.inputKar();
              if (kar.sts_peg == 1) {
                     tetap.inputTetap();
                     System.out.println("Gaji Diterima : " +
                            df.format(tetap.totalGaji()));
              } else {
                     kontrak.inputKontrak();
                     System.out.println("Upah Diterima : " +
                            df.format(kontrak.totalUpah()));
              }
       }
}
