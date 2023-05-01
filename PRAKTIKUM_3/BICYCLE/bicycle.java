package PRAKTIKUM_3.BICYCLE;

public class bicycle {
    int speed = 0;
    int gear = 0;

    // methods

    void ChangeGear(int newGear )
    {
        gear = gear + newGear;
        System.out.print("\ngear : " +gear );
    }
    void ChangeSpeed(int increment)
    {
        speed = speed + increment;
        System.out.print("\nSpeed : " +speed);
    }
     
}
