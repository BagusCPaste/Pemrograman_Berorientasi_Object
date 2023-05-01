package PRAKTIKUM_7.LATIHAN_2;

public class KaryawanTetap extends Karyawan{
       double gapok;
       int jmlAnak;

       public void inputTetap() throws IOException {
              BufferedReader keyboard = new BufferedReader(
              new InputStreamReader(System.in));
              System.out.println("\n~~ Karyawan Tetap ~~");
              System.out.print("Gaji Pokok : ");
              gapok = Double.parseDouble(keyboard.readLine());
              System.out.print("Jumlah Anak : ");
              jmlAnak = Integer.parseInt(keyboard.readLine());
       }

       public double totalGaji() {
              return gapok + (jmlAnak * (0.1 * gapok));
       }   
}
