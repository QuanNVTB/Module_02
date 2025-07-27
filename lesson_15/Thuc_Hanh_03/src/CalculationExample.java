import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.print("Nhap y: ");
        int y = sc.nextInt();
        CalculationExample example = new CalculationExample();
        example.calculate(x, y);
    }

    public void calculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tong x + y = " + a);
            System.out.println("Hieu x - y = " + b);
            System.out.println("Tich x * y = " + c);
            System.out.println("Thuong x / y = " + d);
        }catch (Exception e){
            System.out.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
