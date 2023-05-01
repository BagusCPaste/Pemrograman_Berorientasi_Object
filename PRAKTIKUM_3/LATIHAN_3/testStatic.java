package PRAKTIKUM_3.LATIHAN_3;

public class testStatic {
    int a = 1;
    protected int b = 2;
    public int c = 3;
    static int d = 4;
    private int e = 5;

    void testsatu()
    {
        dua();
        System.out.println("satu ______________________");
        System.out.println("satu _____________________a" + a);
        System.out.println("satu _____________________b" + b);
        System.out.println("satu _____________________c" + c);
        System.out.println("satu _____________________d" + d);
        System.out.println("satu _____________________e" + e);
    }
    void dua(){
        testsatu();
        System.out.println("satu _____________________b" + b);

    }
    public static void main(String[] args) {
        
    }


    
}
