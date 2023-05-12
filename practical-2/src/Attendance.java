public class Attendance {
    Time time_in;
    Time time_out;
    String date;

    Attendance(Time tin, Time tout, String d) {
        time_in = tin;
        time_out = tout;
        date = d;
    }
}