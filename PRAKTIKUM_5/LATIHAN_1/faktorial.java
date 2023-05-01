package PRAKTIKUM_5.LATIHAN_1;

import java.util.Scanner;

public class faktorial {
       public static void main(String[] args) {
              long fak = 1;
              int bil, pecah;
              Scanner input = new Scanner(System.in);
              System.out.print(" Bilangan : ");
              bil = input.nextInt(); 
              for (int i = 1; i <= bil; i++) {
                     System.out.print(fak + " X " + i + " = ");
                     fak = fak * i;  

                     System.out.println(fak + "\n ");
              }
              input.close();
       }
}
