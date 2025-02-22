package Bai4_6;

public class Mammal extends Animal {
    // Constructor
    public Mammal(String name) {
        super(name);
    }

    // Override toString()
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}