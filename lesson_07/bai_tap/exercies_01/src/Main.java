import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5.0, "red", true);
        shapes[1] = new Rectangle(4.0, 6.0, "blue", false);
        shapes[2] = new Circle(3.0, "yellow", true);
        shapes[3] = new Circle(2.5, "pink", false);
        shapes[4] = new Rectangle(3.0, 7.0, "black", true);

        for (Shape shape : shapes) {
            double oldArea = shape.getArea();
            double percent = 1 + random.nextInt(100);

            shape.resize(percent);
            double newArea = shape.getArea();

            System.out.println(shape.getClass().getSimpleName() + ":");
            System.out.printf("  Tăng kích thước: +%.2f%%\n", percent);
            System.out.printf("  Diện tích trước: %.2f\n", oldArea);
            System.out.printf("  Diện tích sau:   %.2f\n", newArea);
            System.out.println("  Thông tin: " + shape);
            System.out.println("----------------------------------");
        }
    }
}