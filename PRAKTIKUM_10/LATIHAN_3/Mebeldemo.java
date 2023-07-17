package PRAKTIKUM_10.LATIHAN_3;

public class Mebeldemo {
       public static void main(String[] args) {

              System.out.println("MEJA");
              Meja meja = new Meja();
              meja.setJmlKaki(4);
              System.out.println("Jumlah Kaki Meja: " + meja.jmlKaki);
              System.out.println("");
              System.out.println("MEJA MAKAN");
              MejaMakan mejaMakan = new MejaMakan();
              mejaMakan.setJmlKaki(4);
              mejaMakan.setJmlKursi(4);
              mejaMakan.setHarga(1000000);
              System.out.println("Harga Meja Makan: " + mejaMakan.getHarga());
              System.out.println("Jumlah Kaki Meja Makan: " + mejaMakan.jmlKaki);
              System.out.println("Jumlah Kursi Meja Makan: " + mejaMakan.jmlKursi);
              System.out.println("");
              System.out.println("MEJA TAMU");
              MejaTamu mejaTamu = new MejaTamu();
              mejaTamu.setJmlKaki(4);
              mejaTamu.setBentukKaca("Bulat");
              mejaTamu.setHarga(500000);
              System.out.println("Harga Meja Tamu: " + mejaTamu.getHarga());
              mejaTamu.discount(10);
              System.out.println("Jumlah Kaki Meja Tamu: " + mejaTamu.jmlKaki);
              System.out.println("Bentuk Kaca Meja Tamu: " + mejaTamu.bentukKaca);
              System.out.println("");
              System.out.println("ALMARI");
              Almari almari = new Almari();
              almari.setRoda(true);
              System.out.println("Roda Almari: " + almari.getRoda());
              System.out.println("");
              System.out.println("ALMARI PAKAIAN");
              AlmariPakaian almariPakaian = new AlmariPakaian();
              almariPakaian.setJmlPintu(2);
              almariPakaian.setHarga(1000000);
              System.out.println("Harga Almari Pakaian: " + almariPakaian.getHarga());
              almariPakaian.discount(10);
              System.out.println("Jumlah Pintu Almari Pakaian: " + almariPakaian.jmlPintu);
              System.out.println("");
              System.out.println("ALMARI MAKAN");
              AlmariMakan almariMakan = new AlmariMakan();
              almariMakan.setJmlRoda(4);

              almariMakan.setHarga(500000);
              System.out.println("Harga Almari Makan: " + almariMakan.getHarga());
              almariMakan.discount(10);
              System.out.println("Jumlah Roda Almari Makan: " + almariMakan.jmlRoda);
       }
}
