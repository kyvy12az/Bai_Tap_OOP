package Bai4_6;

public class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
