package Bai3_2;

public class Main {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3); // 3x^2 + 2x + 1
        MyPolynomial p2 = new MyPolynomial(4, 5);    // 5x + 4

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1 + p2: " + p1.add(p2));
        System.out.println("p1 * p2: " + p1.multiply(p2));
        System.out.println("p1 evaluated at x=2: " + p1.evaluate(2));
    }
}
