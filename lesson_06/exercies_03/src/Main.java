//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(3.5f, 5.3f);
        System.out.println(point2.toString());
        System.out.println(point2);

        MovablePoint mp = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("Before move: " + mp);
        mp.move();
        System.out.println("After move: " + mp);
    }
}