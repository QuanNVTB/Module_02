import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap chi so cua 1 phan tu bat ky: ");
        int x = sc.nextInt();
        try{
            System.out.println("Gia tri cua phan tu co chi so " + x + " la " + arr[x] );
        }catch(IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han cua mang");
        }
    }
}