package Bai4_6;

public class Cat extends Mammal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Method to greet
    public void greets() {
        System.out.println("Meow");
    }

    // Override toString()
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}




