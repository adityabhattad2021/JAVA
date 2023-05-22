package problem6;
import problem6.*;

public class GreatClock extends Time {
    public int seconds;
    public int milliseconds;

    public GreatClock(int hours, int minutes, int seconds, int milliseconds) {
        super(hours, minutes);
        this.seconds = seconds;
        this.milliseconds = milliseconds;
    }

    public GreatClock() {
        super();
        this.seconds = 0;
        this.milliseconds = 0;
    }

    public void add(GreatClock t) {
        super.add(t);
        this.seconds += t.seconds;
        this.milliseconds += t.milliseconds;
        if (this.milliseconds >= 6000) {
            this.seconds += this.milliseconds / 60;
            this.milliseconds %= 1000;
        }
        if(this.seconds >= 60){
            this.minutes += this.seconds/60;
            this.seconds %= 60;
        }
    }

    public void subtract(GreatClock t) {
        super.subtract(t);
        this.seconds -= t.seconds;
        this.milliseconds -= t.milliseconds;
        if (this.milliseconds < 0) {
            this.seconds -= 1;
            this.milliseconds += 60;
        }
        if(this.seconds < 0){
            this.minutes -= 1;
            this.seconds += 60;
        }
    }
}
