import java.util.Scanner;

public class reverse_arrays {
    public static void main(String[] args) {
        int [] arrays;
        int size;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a size : ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while(size > 20);
        arrays = new int[size];
        int i = 0;
        while(i<arrays.length){
            System.out.println("Enter element " + (i + 1) + ": ");
            arrays[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for(int j =0; j < arrays.length; j++){
            System.out.print(arrays[j] + "\t");
        }
        for(int j = 0; j < arrays.length/2; j++){
            int temp = arrays[j];
            arrays[j] = arrays[size - 1 - j];
            arrays[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse Array: ", "");
        for(int j = 0; j < arrays.length; j++){
            System.out.print(arrays[j] + "\t");
        }
    }
}
