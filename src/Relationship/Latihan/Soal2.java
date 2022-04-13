package Relationship.Latihan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Plat {

    static ArrayList<String> plats = new ArrayList<>();
    static String plat;
    static Random random = new Random();
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generatePlat(String kota){
        switch (kota) {
            case "Malang" -> plat = "N";
            case "Jakarta" -> plat = "B";
            case "Surabaya" -> plat = "L";
            default -> {
                return "unidentified";
            }
        }
        plat+= " " + random.nextInt(1000, 9999) + " " + alphabet.charAt(random.nextInt(10)) + alphabet.charAt(random.nextInt(10)) + alphabet.charAt(random.nextInt(10));
        plats.add(plat);
        for (int i = 0; i < plats.size(); i++) {
            if(i==0) {
                return plat;
            } else {
                if(plat.equals(plats.get(i))) {
                    continue;
                } else {
                    return plat;
                }
            }

        }
        return "0";
    }

}

public class Soal2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String kota = scan.nextLine();
            System.out.println(Plat.generatePlat(kota) +"\n");
        }


    }
}
