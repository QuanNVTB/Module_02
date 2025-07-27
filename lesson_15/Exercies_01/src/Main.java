import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap canh a: ");
            double a = sc.nextDouble();
            System.out.print("Nhap canh b: ");
            double b = sc.nextDouble();
            System.out.print("Nhap canh c: ");
            double c = sc.nextDouble();

            Triangle triangle = new Triangle(a, b, c);
            System.out.println(triangle);
        }catch (IllegalTriangleException e) {
            System.out.println("Loi: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Loi nhap lieu. vui long nhap so hop le.");
        }
    }
}