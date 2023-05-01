package PRAKTIKUM_3.LATIHAN_1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class matematikademo
{
    public static void main(String[] args) {

        double angka1,angka2;

        NumberFormat nf = NumberFormat.getInstance(new Locale("in","ID"));

        matematika mtk = new matematika();

        mtk.pertambahan(3,4 );

        System.out.println(" pertambahan : "+
        mtk.pertambahandouble(1.6,3.7));
        
        
        System.out.println(" pengurangan : "+
        mtk.pengurangan(1.3f,3.5f));

        System.out.println(" perkalian : "+
        mtk.perkalian(1.3f,3.5f));

        System.out.println(" pembagian : "+
        mtk.pembagian(1.3f,3.5f));

        // number format

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan Angka pertama : ");
            angka1 = input.nextDouble();
            System.out.print("Masukan Angka kedua : ");
            angka2 = input.nextDouble();
        }
        System.out.println(" pertambahan : "+
        nf.format(mtk.pertambahandouble(angka1,angka2)));
        
        System.out.println(" pengurangan : "+
        nf.format(mtk.pengurangandouble(angka1,angka2)));

        System.out.println(" perkalian : "+
        nf.format(mtk.perkaliandouble(angka1,angka2)));

        System.out.println(" pembagian : "+
        nf.format(mtk.pembagiandouble(angka1,angka2)));

    }
}