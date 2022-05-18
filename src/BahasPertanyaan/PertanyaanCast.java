package BahasPertanyaan;

class BangunDatar {
    private float luas, keliling;

    public float getLuas() {
        return luas;
    }

    public void setLuas(float luas) {
        this.luas = luas;
    }

    public float getKeliling() {
        return keliling;
    }

    public void setKeliling(float keliling) {
        this.keliling = keliling;
    }

    public void printLuas(){
        System.out.println("Luas Bangun Datar adalah : " + getLuas());
    }

    public void printKeliling(){
        System.out.println("Kelilinng Bangun Datar adalah : " + getKeliling());
    }
}

class Lingkaran extends BangunDatar {
    private int radius;

    public Lingkaran(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float getLuas() {
        setLuas(3.14f*radius*radius);
        return super.getLuas();
    }

    @Override
    public void printLuas() {
        System.out.println("Luas Lingkaran adalah : " + getLuas());
    }
}

class Persegi extends BangunDatar {
    private float panjang, lebar;

    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    @Override
    public float getLuas() {
        setLuas(panjang*lebar);
        return super.getLuas();
    }

    @Override
    public void printLuas() {
        System.out.println("Luas Persegi adalah : " + getLuas());
    }
}

public class PertanyaanCast {

    public static void main(String[] args) {

        // UPCASTING
        Persegi P1 = new Persegi(5, 5);
        Lingkaran L1 = new Lingkaran(7);
//        HitungLuas(P1); // Passing sekaligus upcasting dari Persegi ke Bangun Datar, sekaligus polimorfisme
//        HitungLuas(L1); // Passing sekaligus upcasting dari Lingkaran ke Bangun Datar, sekaligus polimorfisme
        BangunDatar BD1 = P1; // UPCASTING Persegi ke Bangun Datar
        BangunDatar BD2 = L1; // UPCASTING Lingkaran ke Bangun Datar
//        BD1.printLuas();
//        BD2.printLuas();

        System.out.println("=========");

//        Persegi P2 = (Persegi) BD1; // DOWNCASTING Bangun Datar ke Persegi
//        Lingkaran L2 = (Lingkaran) BD2; // DOWNCASTING Bangun Datar ke Lingkaran
        HitungLuas(BD1);
        HitungLuas(BD2);
        getSisi(BD1);
        getSisi(BD2);

    }

    public static void HitungLuas(BangunDatar A) {
        A.printLuas();
    }

    public static void getSisi(BangunDatar A) {
        if (A instanceof Persegi) {
            Persegi P1 = (Persegi) A;
            System.out.println("Instance of Persegi");
            System.out.println("- Downcasting BangunDatar ke Persegi");
            System.out.println("- Panjang Sisi : " + P1.getPanjang());
        }
        if (A instanceof Lingkaran) {
            Lingkaran L1 = (Lingkaran) A;
            System.out.println("Instance of Lingkaran");
            System.out.println("- Downcasting BangunDatar ke Lingkaran");
            System.out.println("- Radius Lingkaran : " + L1.getRadius());
        }
    }
}
