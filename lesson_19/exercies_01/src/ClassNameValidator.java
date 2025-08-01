import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testCase = {"C0223G", "A0323K", "M0318G", "P0323A", "C1234H", "C12G"};

        for(String className : testCase) {
            System.out.printf("Tên lớp: %-8s => %s\n", className, isValidClassName(className) ? "Hợp lệ" : "Không hợp lệ");
        }
    }
}
