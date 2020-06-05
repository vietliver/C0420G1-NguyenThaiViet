package BaiTap;
import java.util.Date;

public class XayDungStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}

class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        this.startTime = new Date().getTime();
    }

    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = new Date().getTime();
    }
    public void stop() {
        this.endTime = new Date().getTime();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

}
