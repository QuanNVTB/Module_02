public class OptimizedPrimeFactorization implements Runnable {

    @Override
    public void run() {
        long number = 2;
        while(true){
            if(isPrime(number)){
                System.out.println("Optimized: " + number);
            }
            number++;
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private boolean isPrime(long num){
        if(num == 2) return true;
        if(num < 2) return false;
        if(num % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(num); i+= 2){
            if(num % i == 0) return false;
        }
        return true;
    }
}
