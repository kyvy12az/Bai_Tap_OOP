package Bai4_6;

public class TestAnimals {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal); // Animal[name=Generic Animal]

        Mammal mammal = new Mammal("Mammal1");
        System.out.println(mammal); // Mammal[Animal[name=Mammal1]]

        Cat cat = new Cat("Kitty");
        System.out.println(cat); // Cat[Mammal[Animal[name=Kitty]]]
        cat.greets(); // Meow

        Dog dog1 = new Dog("Buddy");
        System.out.println(dog1); // Dog[Mammal[Animal[name=Buddy]]]
        dog1.greets(); // Woof

        Dog dog2 = new Dog("Charlie");
        dog1.greets(dog2); // Woooof
    }
}



