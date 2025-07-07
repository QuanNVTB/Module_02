import java.util.Scanner;

class exrcies_02{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many prime numbers to print: ");
        int number = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < number){
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n + " is a prime number");
                count++;
            }
            n++;
        }
        sc.close();
    }
}