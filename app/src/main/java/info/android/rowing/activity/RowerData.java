package info.android.rowing.activity;

/**
 * Created by hp on 19/04/2017.
 */

public class RowerData {
    private double strokeRate;
    private double speed;
    private int angle;

    public RowerData(double strokeRate, double speed, int angle) {
        this.strokeRate = strokeRate;
        this.speed = speed;
        this.angle = angle;
    }

    public void setStrokeRate(double strokeRate) {
        this.strokeRate = strokeRate;
    }

    public double gettrokeRate() {
        return strokeRate;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
