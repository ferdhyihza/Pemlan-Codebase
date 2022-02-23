package Bab1ClassDanObject;

class Person {

    String firstName;
    String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void panggil() {
        System.out.println("Halo, nama saya " + firstName + " " + lastName);
    }
}

public class Materi {

    public static void main(String[] args) {

        Person orang1 = new Person();
        orang1.panggil();
        orang1.firstName = "Ferdhy";
        orang1.lastName = "Ihza";
        orang1.panggil();

        Person orang2 = new Person("Budi", "Susanti");
        orang2.panggil();



    }
}
