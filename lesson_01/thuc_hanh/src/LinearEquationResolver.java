import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();

       if(a!=0){
           double answer = (c-b)/a;
           System.out.printf("Equation pass with x = %f!\n",  answer);
       }else{
           if(b==c){
               System.out.println("The solution is all x!" );
           }else{
               System.out.println("No solution!");
           }
       }

    }
}
