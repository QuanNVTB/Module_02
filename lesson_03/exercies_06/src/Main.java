import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows, cols;
        System.out.print("Nhap so dong cua ma tran: ");
        rows = in.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        cols = in.nextInt();
        double[][] arr = new double[rows][cols];
        System.out.println("Nhap cac phan tu cho ma tran: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhap phan tu [" + (i+1) + "][" + (j+1) + "]: ");
                arr[i][j] = in.nextDouble();
            }
        }

        //Chi so can tinh tong
        int col;
         do{
             System.out.print("Nhap chi so cot can tinh tong(tu 0 den " + (cols - 1)+ "): ");
             col = in.nextInt();
         }while (col < 0 || col >= cols);

         double sum = 0;
         for(int i = 0; i < rows; i++) {
             sum += arr[i][col];
         }
        System.out.println("Tong cua cot " + col + " la: " + sum);
    }
}