//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int DISTANCE = 100;
    public static  int STEP = 2;
    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread t1 = new Thread(carA);
        Thread t2 = new Thread(carB);
        Thread t3 = new Thread(carC);

        System.out.println("Distance: 1000Km");
        t1.start();
        t2.start();
        t3.start();
    }
}