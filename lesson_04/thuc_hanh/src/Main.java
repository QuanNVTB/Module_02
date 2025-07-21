import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the Height: ");
        double height = sc.nextDouble();
        ClassHCN hcn = new ClassHCN(width, height);
        System.out.println("You rectangle \n" + hcn.display());
        System.out.println("Perimeter of the Rectangle: " + hcn.getPerimeter());
        System.out.println("Area of the Rectangle: " + hcn.getArea());
    }
}