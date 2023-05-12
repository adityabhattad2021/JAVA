public class Time {
    int hour;
    int min;
    int sec;

    Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public static Time add(Time t1, Time t2) {
        Time result = new Time(t1.hour + t2.hour, t1.min + t2.min, t1.sec + t2.sec);

        int temp;
        temp = result.sec % 60;
        if (temp > 0) {
            result.min++;
            result.sec %= 60;
        }
        temp = result.min % 60;
        if (temp > 0) {
            result.hour++;
            result.min %= 60;
        }
        return result;
    }

    public static Time sub(Time t1, Time t2) {
        Time result = new Time(t1.hour - t2.hour, t1.min - t2.min, t1.sec - t2.sec);

        if (result.sec < 0) {
            result.sec += 60;
            result.min--;
        }

        if (result.min < 0) {
            result.min += 60;
            result.hour--;
        }
        return result;
    }

    void display() {
        System.out.print("H: " + hour + " ");
        System.out.print("M: " + min + " ");
        System.out.print("S: " + sec + " ");
        System.out.println();
    }
}