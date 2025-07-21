//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(sum(numbers));
    }

    public static int sum(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length ; i++) {
            total += numbers[i];
        }
        return total;
    }
}