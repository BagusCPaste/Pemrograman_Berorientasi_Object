package PRAKTIKUM_6.transportasi;

public class Bicycle {
       public int speed = 0;
       public int gear = 0;

       public void setGear(int Newgear)
       {
              gear = gear + 1;
              System.out.println("Gear : " + gear);
       }
       public void setSpeed(int Newspeed)
       {
              speed = speed + Newspeed;
              System.out.println("Speed : "+ speed);
       }
}
