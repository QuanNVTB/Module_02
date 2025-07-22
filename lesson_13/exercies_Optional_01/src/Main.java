import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luongw phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu trong mang: ");
        for(int i = 0; i < n; i++){
            System.out.println("arr[" + i + "] =");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));

        System.out.print("Nhap gia tri can tim: ");
        int value = sc.nextInt();

        //ham tim kiem nhi phan
        int result = binarySearch(arr, 0, arr.length - 1, value);

        if(result != -1){
            System.out.println("Phan tu " + value + " duoc tim thay tai vi tri index: " + result);
        }else{
            System.out.println("Khong tim thay phan tu " + value + " trong mang.");
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value){
        if(left > right){
            return -1;
        }
        int middle = (left + right) / 2;
        if(array[middle] == value){
            return middle;
        }else if(value > array[middle]){
            return binarySearch(array, middle + 1, right, value);
        }else {
            return binarySearch(array, left, middle - 1, value);
        }
    }
}