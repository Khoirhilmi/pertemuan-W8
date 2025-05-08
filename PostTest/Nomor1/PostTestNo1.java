package PostTestNomor1;

class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("Nama milik subclass: " + nama);
        System.out.println("Nama milik superclass: " + super.nama);
    }
}

public class PostTestNo1 {
    public static void main(String[] args) {
        GedungSekolah gs = new GedungSekolah();
        gs.tampilkanInfo();
    }
}
