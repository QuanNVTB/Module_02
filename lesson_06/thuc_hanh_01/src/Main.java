//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        Circle circle2 = new Circle(3.5, "indigo", false);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle(2.3, 3.5);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.3, 3.5, "orange", true);
        System.out.println(rectangle2);

        Square square1 = new Square(2.3);
        System.out.println(square1);
        Square square2 = new Square(5.8, "yellow", true);
        System.out.println(square2);

    }
}