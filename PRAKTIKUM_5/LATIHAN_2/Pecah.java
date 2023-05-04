package PRAKTIKUM_5.LATIHAN_2;

import java.util.Scanner;

public class Pecah {
       public static void main(String[] args) {

              int bil, pecah;

              Scanner input = new Scanner(System.in);
              System.out.print("Bilangan : ");
              bil = input.nextInt();
              for (int i = 1; i <=bil; i++){
                     System.out.print(i + " ");
                     if (i % 5 == 0){
                            System.out.println("");
                     }
              }
              System.out.println("\n_____________________");
              System.out.print(" Dipecah : ");
              pecah = input.nextInt();
              for (int j = 1; j <= bil; j++) {
                     System.out.print(j+" ");
                     if (j % pecah == 0) {
                            System.out.println("");
                     }
              }
       }
       
}
