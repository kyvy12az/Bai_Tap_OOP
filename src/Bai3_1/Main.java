package Bai3_1;

public class Main {

    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3, 4);
        MyComplex c2 = new MyComplex(1, -2);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 + c2: " + c1.addNew(c2));
        System.out.println("c1 - c2: " + c1.subtractNew(c2));
        System.out.println("c1 * c2: " + c1.multiply(new MyComplex(1, -2)));
        System.out.println("c1 / c2: " + c1.divide(new MyComplex(1, -2)));
        System.out.println("Conjugate of c1: " + c1.conjugate());
    }
}
