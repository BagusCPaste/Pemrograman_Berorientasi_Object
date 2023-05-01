package PRAKTIKUM_1.TUGAS2;
// CODE LINGKARAN ( MENGGUNAKAN INPUTAN AN METHOD STATIC )

import java.util.Scanner;

public class lingkaran {
    public static void main(String [] args){
        float phi = 3.14f;
        float r;


        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jari - Jari : ");
        r = input.nextInt();


        System.out.println("-------------- HASIL -----------");
        System.out.println("Jari - Jari Lingkaran = "+r);
        System.out.println("Luas = "+luas(phi,r)+" cm");
        System.out.println("Keliling = "+keliling(phi,r)+" cm");

    }

    static float luas(float a,float b){
        return a*(b*b);
    }
    static float keliling(float a,float b){
        return 2*a*b;
    }
}
