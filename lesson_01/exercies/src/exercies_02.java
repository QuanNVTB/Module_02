import java.util.Scanner;

public class exercies_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd, rate;
        System.out.print("Enter the amount you want to transfer: ");
        usd = sc.nextDouble();
        rate = usd * 25000;
        System.out.printf("%.2f USD convert to %.2f VND\n", usd, rate);
    }
}
