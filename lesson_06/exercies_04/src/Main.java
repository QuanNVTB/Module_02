import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Nhap canh 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Nhap canh 3: ");
        double side3 = sc.nextDouble();

        sc.nextLine();

        System.out.print("Nhap mau sac: ");
        String color = sc.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("Thong tin tam giac: ");
        System.out.println(triangle.toString());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Dien tich: " + triangle.getArea());
    }
}