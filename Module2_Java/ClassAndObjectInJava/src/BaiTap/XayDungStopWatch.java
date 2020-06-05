package BaiTap;
import java.util.Date;

public class XayDungStopWatch {
    public static void main(String[] args) {

    }
}

class StopWatch {
    private int startTime;
    private int endTime;
    public void getStartTime() {
        return this.startTime;
    }
    public void getEndTime() {
        return this.endTime;
    }


    public void start() {
        this.startTime = new Date();
    }


}
