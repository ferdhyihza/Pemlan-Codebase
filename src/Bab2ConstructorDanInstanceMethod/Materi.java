package Bab2ConstructorDanInstanceMethod;

class Mobil {

    // Atribut
    String merk;
    String transmisi;
    int maxSpeed;

    // Constructor (Default)
    public Mobil() {
    }

    // Constructor (Overloading)
    public Mobil(String merk, String transmisi, int maxSpeed) {
        this.merk = merk;
        this.transmisi = transmisi;
        this.maxSpeed = maxSpeed;
    }

    public Mobil(String merk) {
        this.merk = merk;
    }

    public Mobil(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Instance Method
    public void spek(String pemilik){
        System.out.println("Pemilik: " + pemilik);
        spek();
    }

    public void spek(){
        System.out.println("Nama merk: " + this.merk + "\n" +
                "Jenis transmisi: " + this.transmisi + "\n" +
                "Kecepatan maksimal: " + this.maxSpeed + "\n");
    }
}

public class Materi {

    public static void main(String[] args) {

        Mobil m1 = new Mobil();
        m1.merk = "Honda Brio";
        m1.transmisi = "Automatic";
        m1.maxSpeed = 800;

        Mobil m2 = new Mobil("Toyota Avanza", "Manual", 700);

        m1.spek();
        m2.spek("Ferdhy");

        Mobil m3 = new Mobil(500);

        m3.spek();
    }
}
