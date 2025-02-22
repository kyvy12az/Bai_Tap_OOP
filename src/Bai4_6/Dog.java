package Bai4_6;

public class Dog extends Mammal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Method to greet
    public void greets() {
        System.out.println("Woof");
    }

    // Overloaded method to greet another dog
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    // Override toString()
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}



