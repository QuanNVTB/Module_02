//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] list = {5, 3, 8, 2, 1, 4};

        BubbleSort .bubbleSort(list);
        System.out.print("Mang sau khi sap xep: ");
        for(int value : list){
            System.out.print(value + " ");
        }
    }
}