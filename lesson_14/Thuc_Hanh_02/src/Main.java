import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for(int i = 0; i < list.length; i++){
            list[i] = sc.nextInt();
        }
        System.out.print("Your input list: ");
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing..");
        BubbleSortByStep.bubbleSortByStep(list);

    }
}