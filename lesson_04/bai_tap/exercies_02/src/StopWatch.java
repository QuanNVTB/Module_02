public class StopWatch {
    private  long startTime;
    private  long endTime;

    public StopWatch() {

    }
    public void start() {
        this.endTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public  long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
