package Latihan2;

public class ZooDemo {
    static void test(Binatang a) {
        a.makan();
        a.tidur();
        a.mati();
    }

    public static void main(String[] args) {
        Bebek donald = new Bebek();
        Harimau macan = new Harimau();
        test(macan);
        test(donald);
    }
}
