package PRAKTIKUM_3.LATIHAN_3;

public class testStatic {
    int a = 10;

    static int b = 20;
    protected int c = 30;
    public int d = 40;
    private int e = 30;

    void satu(){
        dua();
        System.out.println("satu.....");
        System.out.println("satu.....a"+a);
        System.out.println("satu.....b"+b);
        System.out.println("satu.....c"+c);
        System.out.println("satu.....d"+d);
        System.out.println("satu.....e"+e);
    }

    static void dua(){
        // satu(): -> error static method cant call non static method
        System.out.println(" dua....."+b);
        // System.out.println(" dua....."+a); -> error static method cant call non static var
    }
    public static void main(String[] args) {
        // satu(); -> error static method cant call non static method
        dua();
    }
}
