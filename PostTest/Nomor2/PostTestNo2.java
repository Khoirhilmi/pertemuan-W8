package PostTestNomor2;

class Orang {
    Orang() {
        System.out.println("Orang dibuat");
    }
}

class Dosen extends Orang {
    Dosen() {
        super(); // memanggil constructor
        System.out.println("Dosen dibuat");
    }
}

public class PostTestNo2 {
    public static void main(String[] args) {
        Dosen d = new Dosen();
    }
}
