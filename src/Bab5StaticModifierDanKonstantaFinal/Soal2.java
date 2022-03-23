package Bab5StaticModifierDanKonstantaFinal;

// Soal 2
//    Suatu kampus bernama BU berniat untuk membuat program pendata mahasiswa baru.
//    mahasiswa yang akan di daftarkan akan memiliki nim, nama, dan umur.
//    pada saat pembuatannya, hanya nama dan umur saja yang diberikan karena nim akan
//    di buatkan otomatis oleh sistem dan nim setiap siswa berbeda satu sama lain.
//    penentuan nim dilakukan dengan aturan:
//	    a. nim pertama bernilai 29032020101
//	    b. nim kedua bernilai 29032020105
//	    c. nim ketiga bernilai 29032020109
//      d. dst
//    Kampus tersebut dapat melakukan cetakDataMahasiswa dengan menginputkan mahasiswa,
//    dan akan mengeluarkan output berupa data diri mahasiswa tersebut.

class Mahasiswa {
    private static int nimGenerate = 1;
    private final String NIM_BASE = "2903202010";

    private final String nim;
    private String name;
    private int umur;

    public Mahasiswa(String name, int umur) {
        this.name = name;
        this.umur = umur;
        this.nim = NIM_BASE + nimGenerate;
        nimGenerate += 4;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public int getUmur() {
        return umur;
    }

    public static void getMahasiswa(Mahasiswa mahasiswa) {
        System.out.printf("NIM: %s\nNama: %s\nUmur: %d\n\n", mahasiswa.getNim(), mahasiswa.getName(), mahasiswa.getUmur());
    }
}

public class Soal2 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Hendri Satria", 20);
        Mahasiswa mahasiswa2 = new Mahasiswa("Yusuf", 21);

        Mahasiswa.getMahasiswa(mahasiswa1);
        Mahasiswa.getMahasiswa(mahasiswa2);
    }

}
