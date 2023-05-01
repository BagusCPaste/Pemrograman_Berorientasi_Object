package PRAKTIKUM_1.TUGAS2;
// CODE KUBUS ( MENGGUNAKAN INPUTAN AN METHOD STATIC )


import java.util.Scanner;

public class kubus {
    public static void main(String [] args){
        int Panjang;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan Panjang Sisi Kubus : ");
            Panjang = input.nextInt();
        }
        System.out.println("-------------- HASIL -----------");
        System.out.println("Panjang sisi Kubus = "+Panjang);
        System.out.println("Luas = "+luas(Panjang)+" cm");
        System.out.println("Keliling = "+keliling(Panjang)+" cm");

    }

    static int luas(int a){
        return 6*a*a;
    }
    static int keliling(int a){
        return a*a*a;
    }
}
