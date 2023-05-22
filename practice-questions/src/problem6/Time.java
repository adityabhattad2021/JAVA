package problem6;

public class Time {
    public int hours;
    public int minutes;

    public Time(int hours, int minutes) {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid Time");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time() {
        this.hours = 0;
        this.minutes = 0;
    }

    public void add(Time t) {
        this.hours += t.hours;
        this.minutes += t.minutes;
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
    }

    public void subtract(Time t) {
        this.hours -= t.hours;
        this.minutes -= t.minutes;
        if (this.minutes < 0) {
            this.hours -= 1;
            this.minutes += 60;
        }
    }

    public String toString() {
        return this.hours + ":" + this.minutes;
    }
}
