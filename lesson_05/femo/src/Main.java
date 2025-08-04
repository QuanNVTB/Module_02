//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        void method(int[] x) {
            x[0] = 5;
            x[1] = 5;
        }
        public static void main(String[] args) {
            Main o = new Main();
            int[] y = {1, 1};
            o.method(y);
            System.out.printf("x=%d, y=%d", y[0], y[1]);

    }
}