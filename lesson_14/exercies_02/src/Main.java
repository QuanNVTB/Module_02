//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static void insertionSort(int[] list) {
        int pos;
        int x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && list[pos - 1] > x) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }
}