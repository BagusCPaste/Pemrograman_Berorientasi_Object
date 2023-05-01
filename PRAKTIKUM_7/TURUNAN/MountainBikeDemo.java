package PRAKTIKUM_7.TURUNAN;

class MountainBike extends Bicycle {
       int seatHeight;

       public void setHeight(int newValue) {
              seatHeight = newValue;
              System.out.println("Seat Height:" + seatHeight);
       }
}
class MountainBikeDemo {

       public static void main(String[] args) {
              MountainBike mbike = new MountainBike();
              // Memanggil method di object
              mbike.speedUp(30);
              mbike.changeGear(5);
              mbike.setHeight(30);  
       }
}