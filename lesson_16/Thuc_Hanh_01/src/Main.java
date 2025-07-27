import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();

        ReadFileText readFileEx = new ReadFileText();
        readFileEx.readFileText(path);
    }
}