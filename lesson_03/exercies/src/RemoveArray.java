import java.util.Scanner;

public class RemoveArray {
    public static void main(String[] args) {
        int[] arr = {3, 5,6,2, 19, 20};
        int size = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.print("Enter the element to be deleted: ");
        int index = sc.nextInt();

        int index_del = -1;
        for(int i = 0; i < size; i++){
            if(arr[i] == index){
                index_del = i;
                break;
            }
        }
        if(index_del == -1){
            System.out.println("Value not found in arr");
        }else{
            for(int i = index_del; i < size - 1; i++){
                arr[i] = arr[i + 1];
            }
            size--;
        }
        System.out.println("Elements in array after deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " " );

        }
    }
}
