import java.util.Scanner;

public class primeNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number < 2){
            System.out.println(number + " is not a prime number");
        }else{
            boolean check = true;
            for(int i = 2; i <= Math.sqrt(number); i++ ){
                if(number % i == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(number + " is a prime number");
            }else{
                System.out.println(number + " is not a prime number");
            }
        }
    }
}
