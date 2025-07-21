import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = in.nextDouble();
        System.out.println("Enter b: ");
        double b = in.nextDouble();
        System.out.println("Enter c: ");
        double c = in.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if(delta > 0){
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println("Nghiem 1: " + quadraticEquation.getRoot1());
            System.out.println("Nghiem 2: " + quadraticEquation.getRoot2());
        }else if(delta == 0){
            System.out.println("Phuong trinh co nghiem kep: " + quadraticEquation.getRoot1());
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}