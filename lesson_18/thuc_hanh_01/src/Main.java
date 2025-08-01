//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunnableDemo run1 = new RunnableDemo("Thread-1-HR-Database");
        run1.statr();

        RunnableDemo run2 = new RunnableDemo("Thread-2-Send-Email");
        run2.statr();

        System.out.println("Main thread stopped!!");
    }
}