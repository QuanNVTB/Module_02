import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu can chen: ");
        int x = sc.nextInt();
        System.out.print("Mảng ban đầu: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Nhap vi tri can chen");
        int index = sc.nextInt();

        if (index <= -1 || index >= arr.length) {
            System.out.println("Khong the chen");
        }

        int[] newArr = new int[arr.length + 1];
        //sao chép từ vị trí 0 tới vị trí index
        for(int i = 0; i < index; i++){
            newArr[i] = arr[i];
        }
        //Chèn phần tử X vào vị trí index
        newArr[index] = x;

        //sao chép phần tử từ vị trí index tới arr.length
        for(int i = index; i < arr.length; i++){
            newArr[i + 1] = arr[i];
        }

        System.out.print("Mảng sau khi chèn: ");
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}