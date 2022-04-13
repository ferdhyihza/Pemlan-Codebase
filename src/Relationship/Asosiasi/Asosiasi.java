package Relationship.Asosiasi;

// Asosiasi adalah hubungan antara dua kelas terpisah yang terbentuk melalui Objek mereka.
// Menggambarkan hubungan antar kelas yang tidak saling memiliki, hanya mengambil nilai dan atribut kelas lain saja.
// Asosiasi dapat berupa one-to-one, one-to-many, many-to-one, many-to-many.
// Komposisi dan Agregasi adalah dua bentuk asosiasi.

class Manusia {

    private String nama;

    Manusia(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}

class Motor {

    private String nama;

    Motor(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}

// Class 3 -  Asosiasi antara kedua kelas di method main
// Dalam contoh di atas, dua kelas terpisah Motor dan Manusia diasosiasikan melalui Objek mereka. Manusia dapat memiliki banyak motor, Jadi ini adalah hubungan satu-ke-banyak.
public class Asosiasi {

    public static void main(String[] args) {

        Manusia manusia = new Manusia("Seya");
        Motor motor  = new Motor("Gesit");

        System.out.println(manusia.getNama() + " memiliki motor " + motor.getNama());
    }
}
