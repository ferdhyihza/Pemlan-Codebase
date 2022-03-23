package Bab5StaticModifierDanKonstantaFinal;

import java.util.ArrayList;

class User {
    private static int idGenerator = 1;

    private final int ID;
    private String name;
    private int age;

    public User(String name, int age) {
        this.ID = idGenerator;
        this.name = name;
        this.age = age;
        idGenerator++;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        User.idGenerator = idGenerator;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printUser(){
        System.out.println(getID() + " " + getName() + " " + getAge());
    }

    public static void printUser(User user) {
        System.out.println(user.getID() + " " + user.getName() + " " + user.getAge());
    }
}

public class Materi {

    public static void main(String[] args) {

        User user1 = new User("Dedik Kurniawan", 70);
        User user2 = new User("Sayuti", 60);

        System.out.println("\nArrayList\n");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        for (User user : users) {
            User.printUser(user);
        }
    }
}
