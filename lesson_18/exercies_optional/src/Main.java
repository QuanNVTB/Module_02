//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Runnable lazy = new LazyPrimeFactorization();
        Runnable optimized = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazy);
        Thread optimizedThread = new Thread(optimized);

        lazyThread.start();
        optimizedThread.start();
    }
}