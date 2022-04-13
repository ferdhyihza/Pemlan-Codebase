package Relationship.Latihan;

import java.util.ArrayList;

class Person {
    final private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Vehicle {
    final private String jenisKendaraan;
    final private int CC;
    final private String colour;

    public Vehicle(String jenisKendaraan, int CC, String colour) {
        this.jenisKendaraan = jenisKendaraan;
        this.CC = CC;
        this.colour = colour;
    }

    public String getTypeName() {
        return jenisKendaraan;
    }

    public int getCC() {
        return CC;
    }

    public String getColour() {
        return colour;
    }
}

class STNK {
    String nopol;
    final Person owner;
    final Vehicle car;

    public STNK(String nopol, Person owner, Vehicle car) {
        this.nopol = nopol;
        this.car = car;
        this.owner = owner;
    }

    public void getInfo(){
        System.out.println("Informasi STNK");
        System.out.printf("   %-15s : %s\n", "Nomor Polisi", this.nopol);
        System.out.printf("   %-15s : %s\n", "Nama Pemilik", owner.getName());
        System.out.printf("   %-15s : %s\n", "Alamat", owner.getAddress());
        System.out.printf("   %-15s : %s\n", "Tipe Kendaraan", car.getTypeName());
        System.out.printf("   %-15s : %s CC\n", "Kapasitas Mesin", car.getCC());
        System.out.printf("   %-15s : %s\n", "Warna Kendaraan", car.getColour());
    }

}

class Samsat {
    private ArrayList<STNK> stnks = new ArrayList<>();
    private int jumlahSTNK;

    public void createSTNK(String nopol, Person owner, Vehicle car){
        STNK stnk = new STNK(nopol, owner, car);
        stnks.add(stnk);
        jumlahSTNK++;
    }

    public void printAllInfoSTNK(){
        System.out.println("=============== STNK Terdaftar ===============");
        for (int i = 0; i < stnks.size(); i++) {
            System.out.print((i+1) + ". ");
            stnks.get(i).getInfo();
        }
    }

    public int getJumlahSTNK(){
        return jumlahSTNK;
    }
}

public class Soal1 {

    public static void main(String[] args) {

        Person person1 = new Person("Aceng", "Batu");
        Person person2 = new Person("Clara", "Jakarta");
        Person person3 = new Person("Edward", "Surabaya");

        Vehicle vehicle1 = new Vehicle("Truk", 5000, "Kuning");
        Vehicle vehicle2 = new Vehicle("Mobil", 2000, "Hitam");
        Vehicle vehicle3 = new Vehicle("Motor", 150, "Putih");

        Samsat samsatUB = new Samsat();
        samsatUB.createSTNK("N 1234 AKA", person1, vehicle1);
        samsatUB.createSTNK("B 1762 CUY", person2, vehicle2);
        samsatUB.createSTNK("L 9845 HEQ", person3, vehicle3);

        System.out.println("Jumlah STNK di Samsat: " + samsatUB.getJumlahSTNK());
        samsatUB.printAllInfoSTNK();
    }
}
