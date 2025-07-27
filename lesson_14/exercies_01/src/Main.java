import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.print("Nhap " + n + " so nguyen: ");
        for(int i = 0; i < n; i++){
            System.out.print("array[" + i + "] = " );
            array[i] = sc.nextInt();
        }
        System.out.print("Mang ban dau: ");
        for(int arr : array){
            System.out.println(arr + "\t");
        }

        System.out.println("Bat dau sap xep");
        InsertionSortByStep.insertionSortByStep(array);

        System.out.println("Ket thuc sap xep");
        System.out.print("Mang da sap xep: ");
        for(int arr : array){
            System.out.println(arr + "\t");
        }
    }
}