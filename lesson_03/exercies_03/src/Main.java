import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[3];
        Scanner sc = new Scanner(System.in);

            for(int i = 0; i < arr1.length; i++) {
                System.out.print("Nhap gia tri phan tu thu " + (i + 1) + " cho arr1: ");
                arr1[i] = sc.nextInt();
            }

            for(int i = 0; i < arr2.length; i++) {
                System.out.print("Nhap gia tri phan tu " + (i+1) + " cho arr2: ");
                arr2[i] = sc.nextInt();
            }
        int[] arr3 = new int[arr1.length + arr2.length];
            for(int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i];
            }
            for(int i = arr1.length, j = 0; i < arr3.length; i++, j++) {
                arr3[i] = arr2[j];
            }

            for(int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i] + " ");
            }
    }
}