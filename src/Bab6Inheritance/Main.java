package Bab6Inheritance;

class Vehicle{

    private String nama;

    Vehicle(String n){
        System.out.println("Parent");
        this.nama = n;
        System.out.println(nama);
    }

}

class Car extends Vehicle{
    Car(String nama){
      super(nama);
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mobil");
    }
}
