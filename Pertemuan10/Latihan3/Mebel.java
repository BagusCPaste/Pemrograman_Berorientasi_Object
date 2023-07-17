package Latihan3;

public class Mebel {
    protected int harga;
    protected String bahan;
}

interface Diskon {
    public void Diskon();
}

class Almari extends Mebel {
    protected Boolean roda;
}

class Meja extends Mebel {
    private int jmlKaki;
}

class AlmariMakar extends Almari implements Diskon {
    private int jlmRoda;

    public void Diskon() {

    }
}

class AlmariPakaian extends Almari implements Diskon {
    private int jlmPintu;

    public void Diskon() {

    }
}

class MejaMakar extends Meja {
    private int jlmKursi;
}

class MejaTamu extends Meja implements Diskon {
    private String bentukKaca;
    public void Diskon() {

    }
}