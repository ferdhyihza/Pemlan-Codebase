package BahasPertanyaan;

interface Bernafas {
    void bernafas();
}

interface Berjalan {
    String berjalan();
}


abstract class MakhlukHidup implements Bernafas, Berjalan {

    public void bernafas(){
        System.out.println("adalah Makhluk hidup yang dapat bernafas");
    }

    public abstract String berjalan();

    void showName(){
        System.out.println("Makhluk Hidup");
    }
}

class Manusia extends MakhlukHidup {
    public String berjalan() {
        return "Manusia berjalan dengan dua kaki";
    }
}

class Sapi extends MakhlukHidup {
    public String berjalan(){
        return "Sapi berjalan dengan 4 kaki";
    }
}

class Kanguru extends MakhlukHidup {
    public String berjalan(){
        return "Kanguru berjalan dengan melompat pada 2 kakinya";
    }

    void showName(){
        System.out.println("Saya Kanguru");
    }
}

public class PertanyaanPolimorfisme {

    public static void main(String[] args) {

        MakhlukHidup makhlukHidup = new Manusia();
        System.out.println(makhlukHidup.berjalan());

        MakhlukHidup makhlukHidup2 = new Sapi();
        System.out.println(makhlukHidup2.berjalan());

        MakhlukHidup makhlukHidup3 = new Kanguru();
        System.out.println(makhlukHidup3.berjalan());
        makhlukHidup3.showName();

        System.out.println("===================");

        printBerjalan(new Manusia());
        printBerjalan(new Sapi());
        printBerjalan(new Kanguru());


    }
//
//    public static void printBerjalan(Manusia manusia) {
//        System.out.println(manusia.berjalan());
//    }
//
//    public static void printBerjalan(Sapi sapi) {
//        System.out.println(sapi.berjalan());
//    }
//
//    public static void printBerjalan(Kanguru kanguru) {
//        System.out.println(kanguru.berjalan());
//    }

    // Keuntungan Polimorfisme
    public static void printBerjalan(MakhlukHidup makhlukHidup) {
        System.out.println(makhlukHidup.berjalan());
    }
}
