import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array initial: " + Arrays.toString(numbers));
        reverse(numbers);
        System.out.println("Mảng đảo ngược: " + Arrays.toString(numbers));
    }
    public static void reverse(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int number : numbers) {
            stack.push(number);
        }
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }
    }
}
