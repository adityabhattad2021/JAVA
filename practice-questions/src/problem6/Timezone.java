package problem6;
import problem6.*;

public class Timezone {
    public static Time convertISTtoEST(Time t) {
        t.subtract(new Time(9, 30));
        return t;
    }

    public static Time convertESTtoIST(Time t) {
        t.add(new Time(9, 30));
        return t;
    }

}
