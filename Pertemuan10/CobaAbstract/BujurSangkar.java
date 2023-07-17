package Pertemuan10.CobaAbstract;

public class BujurSangkar extends Bangun2d {
    private int sisi;

    public BujurSangkar(int sisi) {
        this.sisi = sisi;
        System.out.println("Sisi Bujur Sangkar : " + sisi);
    }

    public void cetakLuas() {
        int luas = sisi * sisi;
        System.out.println("Luas Bujur Sangkar : " + luas);
    }

    public void cetakKeliling() {
        int keliling = 4 * sisi;
        System.out.println("Keliling Bujur Sangkar : " + keliling);
    }
}