package Relationship.Komposisi;

// Komposisi adalah bentuk Agregasi terbatas di mana dua entitas sangat bergantung satu sama lain.
// - Ini mewakili bagian dari hubungan.
// - Dalam komposisi, kedua entitas bergantung satu sama lain.
// - Ketika ada komposisi antara dua entitas, objek yang dikomposisikan tidak dapat eksis tanpa entitas lainnya.

class Komputer {

    public Processor processor;
    public Monitor monitor;

    public Komputer(String processor, String monitor) {
        this.processor = new Processor(processor);
        this.monitor = new Monitor(monitor);
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "processor=" + processor.getNama() +
                ", monitor=" + monitor.getNama() +
                '}';
    }
}

class Processor {
    private String nama;

    public Processor(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "nama='" + nama + '\'' +
                '}';
    }
}

class Monitor {
    private String nama;

    public Monitor(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class Komposisi {


    public static void main(String[] args) {

        // Ketika objek "wadah" dimusnahkan, objek "muatan" ikut musnah

        Komputer komputer = new Komputer("Ryzen 99", "Sumsang");
        System.out.println(komputer.toString());

    }

}
