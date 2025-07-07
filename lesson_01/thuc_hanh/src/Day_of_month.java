import java.util.Scanner;

public class Day_of_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Which month that you want to count days?");
        input = sc.nextInt();

        switch (input) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + input + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + input + " co 30 ngay");
                break;
            case 2:
                System.out.println("Thang " + input + " co 28 ngay hoac 29 ngay");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
