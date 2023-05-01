package PRAKTIKUM_1.TUGAS2;
// CODE SEGITIGA ( MENGGUNAKAN INPUTAN AN METHO STATIC )

import java.util.Scanner;

public class luas_segitiga{
    public static void main(String [] args){
        float alas,tinggi;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Alas : ");
     
            alas = input.nextInt();
            System.out.print("tinggi : ");
            tinggi = input.nextInt();
        }
        System.out.println("-------------- HASIL -----------");
        System.out.println("alas = "+alas);
        System.out.println("Tinggi = "+tinggi);
        System.out.println("Luas = "+luas(alas,tinggi)+" cm");
        System.out.println("Keliling = "+keliling(alas,tinggi,tinggi)+" cm");


    }
    static float luas(float a,float b){
        return a*b/2;
    }
    static float keliling(float a,float b,float c){
        return a+b+c;
    }
}