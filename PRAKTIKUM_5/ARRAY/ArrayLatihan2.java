package PRAKTIKUM_5.ARRAY;

import java.util.Scanner;

class Mahasiswa {
       private Scanner input = new Scanner(System.in);
       String nim,nama, predikat;
       char nHuruf;
       float nilaiTugas, nilaiUts, nilaiUas;
       float PnilaiTugas, PnilaiUts, PnilaiUas, nilaiAkhir;

       public Mahasiswa(String nim, String nama, float nilaiTugas, float nilaiUts, 
       float nilaiUas) {
       this.nim = nim;
       this.nama = nama;
       this.nilaiTugas = nilaiTugas;
       this.nilaiUts = nilaiUts;
       this.nilaiUas = nilaiUas;
       }

       public Mahasiswa(){
       }

       char getNilaiHuruf(float nilai){
              if(nilai >= 85)
              nHuruf = 'A';
              else if(nilai >= 70 && nilai < 85)
              nHuruf = 'B';
              else if(nilai >= 60 && nilai < 70)
              nHuruf = 'C';
              else if(nilai >= 40 && nilai < 60)
              nHuruf = 'D';
              else
              nHuruf = 'E';
              return nHuruf; 
       }

       String getPredikat(char huruf){

              switch(huruf)
              {
                     case 'A' : predikat = "Apik";
                     break;
                     case 'B' : predikat = "Baik";
                     break;
                     case 'C' : predikat = "Cukup";
                     break;
                     case 'D' : predikat = "Dablek";
                     break;
                     default : predikat = "Elek";
              }
              return predikat;
       } 

       void isiData(){
              System.out.println(" ");
              System.out.printf("NIM : "); nim = input.nextLine();
              System.out.printf("Nama : "); nama = input.nextLine();
              System.out.printf("Tugas : "); nilaiTugas = input.nextFloat();
              System.out.printf("UTS : "); nilaiUts = input.nextFloat();
              System.out.printf("UAS : "); nilaiUas = input.nextFloat();
       }

       void HitungNilai(){
              PnilaiTugas = 0.35f * nilaiTugas;
              PnilaiUts = 0.2f * nilaiUts;
              PnilaiUas = 0.45f * nilaiUas;
              nilaiAkhir = PnilaiTugas + PnilaiUts + PnilaiUas;
       }

       void cetakNilai(){
              HitungNilai();
              System.out.println(" ");
              System.out.println("NIM : " + nim);
              System.out.println("Nama : " + nama); 
              System.out.println("Nilai Tugas : " + nilaiTugas + " x 35% = " +
              PnilaiTugas); 
              System.out.println("Nilai UTS : " + nilaiUts + " x 35% = " +
              PnilaiUts); 
              System.out.println("Nilai UAS : " + nilaiUas + " x 35% = " +
              PnilaiUas); 
              System.out.println("Nilai Akhir : " + nilaiAkhir); 
              System.out.println("Nilai Huruf : " + getNilaiHuruf(nilaiAkhir));
              System.out.println("Predikat : " + getPredikat(nHuruf));
       }

       void judul(){
              //HitungNilai();
              //cetakNilai();
              System.out.println("Daftar Nilai PBO");
              System.out.println("----------------");
              System.out.println("NIM\tNama\tN.Tgs\tN.Uts\tN.Uas\tN.Akhir\tN.Huruf\tPredikat");
              //daftarNilai();
              }
              void daftarNilai(){
              System.out.println(nim + "\t" + nama + "\t" + nilaiTugas + "\t" +
              nilaiUts + "\t" + nilaiUas + "\t" + nilaiAkhir + "\t" + nHuruf + "\t" +
              predikat);
       }


}


public class ArrayLatihan2 {

       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);

              while (true) {
                     int b;
                     System.out.print("Input Mahasiswa : ");
                     b = input.nextInt();
                     input.nextLine();

                     Mahasiswa nilai[] = new Mahasiswa[b];
                     for (int i = 0; i < nilai.length; i++){
                            nilai[i] = new Mahasiswa();
                            nilai[i].isiData();
                            nilai[i].cetakNilai(); 
                            nilai[i].judul();

                            for(int j = 0; j <= i; j++){
                            nilai[j].daftarNilai();
                            }
                     }
                     System.out.printf("\nInput data lagi [Y/T] ? : "); char pilihan =
                     input.next().charAt(0);
                     if (pilihan == 't' || pilihan == 'T') 
                     break;
              }  
              input.close();
       }
    
}
