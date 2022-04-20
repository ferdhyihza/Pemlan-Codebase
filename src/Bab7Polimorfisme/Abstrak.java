package Bab7Polimorfisme;

// Abstract class
abstract class Hewan {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Babi extends Hewan {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class Abstrak {

    public static void main(String[] args) {
        Babi myPig = new Babi(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
