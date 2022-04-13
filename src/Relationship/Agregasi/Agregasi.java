package Relationship.Agregasi;

// Agregasi merupakan hubungan antara dua kelas di mana kelas yang satu merupakan bagian dari kelas yang lain
// - Ini mewakili hubungan Has-A.
// - Ini adalah asosiasi searah yaitu hubungan satu arah. Misalnya, suatu departemen dapat memiliki mahasiswa tetapi sebaliknya tidak mungkin dan dengan demikian sifatnya searah.
// - Dalam Agregasi, kedua entri dapat bertahan secara individual yang berarti mengakhiri satu entitas tidak akan memengaruhi entitas lainnya.

import java.util.ArrayList;
import java.util.List;

class Mahasiswa {

    static private int nimGenerator = 1;

    String nama;
    final int nim;
    String departement;

    Mahasiswa(String nama, String departement) {
        this.nama = nama;
        this.nim = nimGenerator;
        this.departement = departement;
        nimGenerator++;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim=" + nim +
                ", departement='" + departement + '\'' +
                '}';
    }
}

// Class 2 - kelas Departemen berisi list dari objek Mahasiswa
// Terkait dengan kelas Mahasiswa melalui Objeknya
class Department {

    String nama;
    private List<Mahasiswa> mahasiswas = new ArrayList<>();

    public Department(String nama){
        this.nama = nama;
    }

    public void addMahasiswa(Mahasiswa mahasiswa){
        mahasiswas.add(mahasiswa);
    }

    public void printMahasiswa() {
        for (Mahasiswa mahasiswa:mahasiswas
             ) {
            System.out.printf("%-5s | %s\n", mahasiswa.nama, mahasiswa.nim);
        }
    }
}

public class Agregasi {


    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Clint", "SI");
        Mahasiswa mahasiswa2 = new Mahasiswa("Miya", "SI");
        Mahasiswa mahasiswa3 = new Mahasiswa("Ruby", "TIF");
        Mahasiswa mahasiswa4 = new Mahasiswa("John", "TIF");

        // Ketika objek "wadah" dimusnahkan, objek "muatan" tetap bisa berdiri sendiri

        Department SI = new Department("SI");
        SI.addMahasiswa(mahasiswa1);
        SI.addMahasiswa(mahasiswa2);

        Department TIF = new Department("TIF");
        TIF.addMahasiswa(mahasiswa3);
        TIF.addMahasiswa(mahasiswa4);

        List<Department> departments = new ArrayList<>();
        departments.add(SI);
        departments.add(TIF);

        System.out.println("Daftar Mahasiswa");

        for (Department department : departments) {
            System.out.println("Departemen: " + department.nama);
            department.printMahasiswa();
        }

//        System.out.println(mahasiswa1.toString());

    }
}
