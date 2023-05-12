public class App {
    public static void main(String[] args) {
      Time t1 = new Time(10, 50, 40);
      Time t2 = new Time(8, 60, 40);
  
      Employee e1 = new Employee("Rahul Singh", 1, "Manager", 5000.0);
      Employee e2 = new Employee("Vivek Rathod", 2, "SDE", 30000.0);
  
      e1.addAttendance(new Attendance(new Time(9, 0, 0), new Time(17, 0, 0), "2022-04-25"));
      e1.addAttendance(new Attendance(new Time(8, 30, 0), new Time(16, 30, 0), "2022-04-26"));
      e1.addAttendance(new Attendance(new Time(8, 45, 0), new Time(16, 45, 0), "2022-04-27"));
  
      e2.addAttendance(new Attendance(new Time(9, 15, 0), new Time(16, 45, 0), "2022-04-25"));
      e2.addAttendance(new Attendance(new Time(9, 0, 0), new Time(17, 0, 0), "2022-04-26"));
      e2.addAttendance(new Attendance(new Time(9, 30, 0), new Time(17, 30, 0), "2022-04-27"));
  
      e1.display();
      System.out.print(e1.name + " total work time: ");
      e1.totalWorkTime();
  
      e2.display();
      System.out.print(e2.name + " total work time: ");
      e2.totalWorkTime();
    }
  }