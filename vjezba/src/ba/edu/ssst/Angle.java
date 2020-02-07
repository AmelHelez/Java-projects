package ba.edu.ssst;

public class Angle {
    private int degrees;
    private int minutes;
    private int seconds;

    public Angle(int degrees,int minutes,int seconds) {
        SetAngle(degrees,minutes,seconds);
    }

    public Angle() {
        this.degrees = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public void SetAngle(int degrees, int minutes, int seconds) {
         int total = 3600 * degrees + 60 * minutes + seconds;
         this.degrees = (total / 3600) % 360;
         this.minutes = (total % 3600) / 60;
         this.seconds = total % 60;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return this.degrees + " deg " + this.minutes + " min " + this.seconds + " sec.";
    }
}
