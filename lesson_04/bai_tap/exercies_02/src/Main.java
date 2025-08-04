import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        Random rand = new Random();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        selectionSort(arr);

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}