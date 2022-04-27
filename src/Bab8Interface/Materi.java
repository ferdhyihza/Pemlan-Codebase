package Bab8Interface;

interface Identitas {
    String getNama();
    void tampilkanUmur();
}

interface MakhlukHidup extends Identitas {
    void makan();
    void berjalan();
    void bersuara();
}

class Manusia implements MakhlukHidup {
    private String nama;
    private int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai sendok garpu");}
    @Override
    public void berjalan() {
        System.out.println("Jalan pakai dua kaki");}
    @Override
    public void bersuara() {
        System.out.println("Suaranya merdu");}
    @Override
    public String getNama() {
        return nama;}
    @Override
    public void tampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);}

}

class Hewan implements MakhlukHidup, Identitas {
    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }
    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }
    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }

    public String getNama (){
        return null;
    }

    public void tampilkanUmur () {}
}

public class Materi {

    public static void main(String[] args) {

        Manusia manusia = new Manusia("Andi", 12);
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        System.out.println(manusia.getNama());
        manusia.tampilkanUmur();

        System.out.println();

        Hewan hewan = new Hewan();
        hewan.berjalan();
        hewan.makan();
        hewan.bersuara();
    }

}
