import java.util.Scanner;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        int[] daysInMonth = {
                31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        day += 1;
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month += 1;
            if (month > 12) {
                month = 1;
                year += 1;
            }
        }
        return day + "/" + month + "/" + year;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day(1-31): ");
        int day = sc.nextInt();

        System.out.print("Enter Month(1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        String result = day + "/" + month + "/" + year;
        String nextDay = findNextDay(day, month, year);
        System.out.println("Ngay hien tai: " + result );
        System.out.println("Ngay tiep theo: " + nextDay);
    }
}
