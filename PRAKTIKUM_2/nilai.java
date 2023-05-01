// LATIHAN 2
//CODE LATIHAN MENGHITUNG NILAI ( MENGGUNAKAN INPUTAN, CLASS DAN OBJEK )


package PRAKTIKUM_2;

import java.util.Scanner;

class deklarasiNilai{
    String nama,nim;
    float nilaiUts,nilaiTugas,nilaiUas,pNilaiUts,pNilaiUas,pNilaiTugas,nilaiAkhir;
    
    void hitung(){
        pNilaiUts = 0.2f * nilaiUts;
        pNilaiUas = 0.35f * nilaiUas;
        pNilaiTugas = 0.45f * nilaiTugas;
        nilaiAkhir = pNilaiUts+pNilaiUas+pNilaiTugas;
    }
    void cetak(String namamu, String nimmu, float ntugasmu, float nutsmu,float nuasmu){
        //float pNilaiUts,pNilaiUas,pNilaiTugas,nilaiAkhir;

        pNilaiUts = 0.2f * nutsmu;
        pNilaiUas = 0.35f * nuasmu;
        pNilaiTugas = 0.45f * ntugasmu;
        nilaiAkhir = pNilaiUts+pNilaiUas+pNilaiTugas;


        System.out.println(" NIM            : "+nimmu);
        System.out.println(" Nama           : "+namamu);
        System.out.println(" Nilai Tugas    : "+pNilaiTugas);
        System.out.println(" Nilai Uts      : "+pNilaiUts );
        System.out.println(" Nilai Uas      : "+pNilaiUas );
        System.out.println(" Nilai Akhir    : "+nilaiAkhir);

    }
    void inputNilai(){

        try (Scanner input = new Scanner(System.in)) {
            System.out.print(" Masukan NIM  : ");
            nim = input.nextLine();
            System.out.print(" Masukan Nama : ");
            nama = input.nextLine();
            System.out.print(" Masukan Nilai Tugas : ");
            nilaiTugas = input.nextFloat();
            System.out.print(" Masukan Nilai Uts : " );
            nilaiUts = input.nextFloat();
            System.out.print(" Masukan Nilai Uas : " );
            nilaiUts = input.nextFloat();
        }
        pNilaiUts = 0.2f * nilaiUts;
        pNilaiUas = 0.35f * nilaiUts;
        pNilaiTugas = 0.45f * nilaiTugas;
        nilaiAkhir = pNilaiUts+pNilaiUas+pNilaiTugas;

        System.out.println(" NIM            : "+nim);
        System.out.println(" Nama           : "+nama);
        System.out.println(" Nilai Tugas    : "+pNilaiTugas);
        System.out.println(" Nilai Uts      : "+pNilaiUts );
        System.out.println(" Nilai Uas      : "+pNilaiUas );
        System.out.println(" Nilai Akhir    : "+nilaiAkhir);

    }
    
}

public class nilai {
    public static void main(String[] args){

        deklarasiNilai hasil = new deklarasiNilai();

        // TES MANUAL
        hasil.cetak("a11","gusaja",50,80,90);

        // TES INPUTAN
        hasil.inputNilai();

    }
    
}
