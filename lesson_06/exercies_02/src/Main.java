//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point2D p2D1 = new Point2D(1.2f, 3.5f);
        System.out.println(p2D1);

        Point3D p3D1 = new Point3D(1.2f, 3.5f, 3.5f);
        System.out.println(p3D1);
        p3D1.setXYZ(7.8f, 9.0f, 1.1f);
        System.out.println("Updêt Point3D: " + p3D1);
    }
}