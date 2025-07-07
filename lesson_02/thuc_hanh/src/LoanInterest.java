import java.util.Scanner;

public class LoanInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = 1;
        double interestRate = 1.0;
        System.out.print("Enter numbẻ of loans: ");
        double money = in.nextDouble();
        System.out.print("Enter number of month: ");
        month = in.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = in.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate / 100)/12 * month;
        }
        System.out.println("total of interest: " + totalInterest);

    }
}
