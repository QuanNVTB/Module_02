import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("-------Menu---------");
        do{
            System.out.println("1. Tim so nguyen to");
            System.out.println("2.Tim UCLN");
            System.out.println("0.Thoat");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    int number = sc.nextInt();
                    boolean check = true;
                    if(number < 2){
                        System.out.println(number + " is not a prime number");
                    }else{
                        for(int i = 2; i <= Math.sqrt(number); i++){
                            if(number % i == 0){
                                check = false;
                                break;
                            }
                        }
                    }
                    if(check){
                        System.out.println(number + " is a prime number");
                    }else {
                        System.out.println(number + " is not a prime number");
                    }
                break;
                case 2:
                    System.out.println("Enter number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter number 2: ");
                    int b = sc.nextInt();
                    int originalA = a;
                    int originalB = b;
                    while(b!= 0){
                        int temp = b;
                        b = a % b;
                        a = temp;
                    }
                    System.out.println("UCLN cua " + originalA + " va " + originalB + " la: " + Math.abs(a));

                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        }while (choice != 0);
    }
}
