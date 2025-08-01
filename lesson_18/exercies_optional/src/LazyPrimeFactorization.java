public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
       long number = 2;
       while (true) {
           if(isPrime(number)){
               System.out.println("Lazy: " + number);
           }
           number++;
           try{
               Thread.sleep(10);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
       }
    }

    public boolean isPrime(long num) {
        if(num < 2) return false;
        for(long i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
