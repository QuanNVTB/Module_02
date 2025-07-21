//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(2.0, 3.0);
        shapes[2] = new Square(6.0); // Square triển khai Colorable
        shapes[3] = new Circle(2.5);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape != null) {
                System.out.printf("  Diện tích: %.2f\n", shape.getArea());
            } else {
                System.out.println("  shape is null!");
            }
            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
        }
            System.out.println("--------------");
        }
    }
}