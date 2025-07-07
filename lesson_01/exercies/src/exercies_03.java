import java.util.Scanner;

public class exercies_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        if(num < 0 || num > 999){
            System.out.println("Pleasr enter a number between 0 and 999");
        }else{
            System.out.println(num + " doc la: ");
            readNumber(num);
        }
    }

    public static void readNumber(int number) {
        if (number == 0) {
            System.out.println("zero");
            return;
        }
        int hundred = number / 100;
        int remainder = number % 100;
        int ten = remainder / 10;
        int unit = remainder % 10;

        if (hundred > 0) {
            readOneDigit(hundred);
            System.out.print("hundred");
            if (remainder > 0) {
                System.out.print("and");
            }
        }
        if (remainder >= 10 && remainder < 20) {
            switch (remainder) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else {
            switch (ten) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
            }
            if (ten > 1 && unit > 0) {
                System.out.print(" ");
            }
            if (ten != 1) {
                if (unit > 0) {
                    readOneDigit(unit);
                }
            }
        }
        System.out.println();
    }

    public static void readOneDigit(int number) {
        switch (number) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
        }
    }
}