import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong cua ma tran: ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cols = sc.nextInt();

        double [][] matrix = new double [rows][cols];
        System.out.println("Nhap cac phan tu cho ma tran: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Phan tu [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        //tim phan tu lon nhat
        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Gia tri lonw nhat trong ma tran: " + max);
        System.out.println("Toa do: dong " + maxRow + ", cot " + maxCol);
    }
}