package Bai4_2;

public class Person {
    private String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // toString method
    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}


