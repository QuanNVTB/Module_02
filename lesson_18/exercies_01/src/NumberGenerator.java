public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(
                    "Thread: " +Thread.currentThread().getName()
                    + ", Number: " + i
                    + ", Object hashCode: " + this.hashCode()
            );

            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Thread bi gian doan.");
            }
        }
    }
}
