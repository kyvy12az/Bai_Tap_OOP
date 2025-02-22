package Bai4_5;

public class TestShapes {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape); // Shape[color=blue, filled=false]

        Circle circle = new Circle(2.5, "green", true);
        System.out.println(circle); // Circle[Shape[color=green, filled=true], radius=2.5]

        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println(rectangle); // Rectangle[Shape[color=yellow, filled=false], width=3.0, length=4.0]

        Square square = new Square(5.0, "purple", true);
        System.out.println(square); // Square[Rectangle[Shape[color=purple, filled=true], width=5.0, length=5.0]]
    }
}
