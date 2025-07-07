import java.util.Scanner;

public class exercies_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("---------Menu--------");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            //hcn
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
