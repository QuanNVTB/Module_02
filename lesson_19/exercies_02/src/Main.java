import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isValidPhoneName(String phoneName) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneName);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String[] testCases = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(84)-(0123456789)"
        };

        for(String phone : testCases) {
            System.out.printf("Số điện thoại: %-20s => %s\n", phone, isValidPhoneName(phone) ? "Hợp lệ" : "Không hợp lệ");
        }
    }
}