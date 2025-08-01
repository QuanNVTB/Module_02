import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Xin chao the gioi";
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tu can tim kiem: ");
        input = sc.nextLine();

        int count = 0;
       int index = name.toLowerCase().indexOf(input.toLowerCase());
       while(index != -1){
           count++;
           index = name.indexOf(input, index + input.length());
       }
        System.out.println("So lan xuat hien: " + count);
    }
}