//LATIHAN NILAI PREDIKAT

package PRAKTIKUM_4.NilaiHurufdanPredikat;

import java.util.Scanner;

public class nilai {

       static Scanner input = new Scanner(System.in);
       char nHuruf,lanjut;
       String predikat, nim,nama;
       float nilaiUts,nilaiTugas,nilaiUas,pNilaiUts,pNilaiUas,pNilaiTugas,nilaiAkhir;
       
       public static void main(String[] args) {
              int n;

              n = input.nextInt();


              nilai[] test = new nilai[n];
              for (int i = 0; i <=n
              
              
               ; i++) {
                     
              }

              
       }

       void hitung()
       {
              pNilaiUts = 0.35f * nilaiUts;
              pNilaiUas = 0.45f * nilaiUas;
              pNilaiTugas = 0.20f * nilaiTugas;
              nilaiAkhir = pNilaiUts+pNilaiUas+pNilaiTugas;
       }
              
       void cetak(){
              
              System.out.println(" NIM            : "+nim);
              System.out.println(" Nama           : "+nama);
              System.out.println(" Nilai Tugas    : "+nilaiTugas+ " 20% : " +pNilaiTugas);
              System.out.println(" Nilai Uts      : "+nilaiUts+ " 35% : " +pNilaiUts );
              System.out.println(" Nilai Uas      : "+nilaiUas+ " 45% : " +pNilaiUas );
              System.out.println(" Nilai Akhir    : "+nilaiAkhir);
              System.out.println("Nilai Huruf     : "+getNilaihuruf(nilaiAkhir));
              System.out.println("Nilai Huruf     : "+getPredikat(getNilaihuruf(nilaiAkhir)));
      
       }
       void inputNilai(){

                  System.out.print(" Masukan NIM  : ");
                  nim = input.next();
                  System.out.print(" Masukan Nama : ");
                  nama = input.next();
                  System.out.print(" Masukan Nilai Tugas : ");
                  nilaiTugas = input.nextFloat();
                  System.out.print(" Masukan Nilai Uts : " );
                  nilaiUts = input.nextFloat();
                  System.out.print(" Masukan Nilai Uas : " );
                  nilaiUas = input.nextFloat(); 
       }

       char getNilaihuruf(float nilai)
       {
              if (nilai>= 85)
                     nHuruf = 'A';
              else if (nilai>= 70 && nilai < 85)
                     nHuruf = 'B';
              else if (nilai>= 60 && nilai < 70)
                     nHuruf = 'C';
              else if (nilai>= 40 && nilai < 60)
                     nHuruf = 'D';
             else 
                     nHuruf = 'E';
              return nHuruf;

       }
       String getPredikat(char huruf)
       {
              switch (huruf) {
                     case 'A':predikat="Apik";
                            break;
                     case 'B':predikat="Baik";
                            break;
                     case 'C':predikat="Cukup";
                            break;
                     case 'D':predikat="Dablek";
                            break;
                     default:predikat= "Elek";
                            break;
              }
              return predikat;
       }
       void judul ()
       {
              System.out.println(" Daftar nilai pbo");
              System.out.println("----------");
              System.out.println("Nim\t\tNama\t\tN.Tugas\t\tN.Uts\t\tN.Uas"+"\t\tN.Akhir"+"\t\tN.Huruf\t\tPredikat");
       }
       void daftarNilai()
       {
              System.out.println(nim+"\t\t"+nama+"\t\t"+nilaiTugas+"\t\t"+nilaiUts+"\t\t"+nilaiUas+"\t\t"+nilaiAkhir+"\t\t"+nHuruf+"\t\t"+predikat);
       }
}
