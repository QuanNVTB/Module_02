import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', pleas");

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: " );
        double b = sc.nextDouble();
        if(a != 0){
            double solution  = -b / a;
            System.out.println("The solution is: " + solution);
        }else{
            if (b==0){
                System.out.println("The solution is all x");
            }else{
                System.out.println("No solution!");
            }
        }
    }
}