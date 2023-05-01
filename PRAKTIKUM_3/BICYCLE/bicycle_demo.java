package PRAKTIKUM_3.BICYCLE;

import java.util.Scanner;

public class bicycle_demo {
    public static void main(String[] args) {
        bicycle sepeda = new bicycle();

        int jmlhgear,jmlhspeed;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print(" Masukan Jumlah gear : ");
            jmlhgear = input.nextInt();
            System.out.print(" Masukan Jumlah speed : " );
            jmlhspeed = input.nextInt();
        }

        sepeda.ChangeGear(jmlhgear);
        sepeda.ChangeSpeed(jmlhspeed);
    }
    
}
