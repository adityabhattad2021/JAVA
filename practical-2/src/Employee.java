public class Employee {
    String name;
    int id;
    String designation;
    double salary;
    Attendance[] presenties;
    int na;

    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.presenties = new Attendance[100];
        na = 0;
    }

    void addAttendance(Attendance a) {
        presenties[na] = a;
        na++;
    }

    void totalWorkTime() {
        Time total = new Time();
        Time temp;
        for (int i = 0; i < na; i++) {
            temp = Time.sub(presenties[i].time_out, presenties[i].time_in);
            total = Time.add(temp, total);
        }
        total.display();
    }

    void findAttendance(String date) {
        for (int i = 0; i < na; i++) {
            if (presenties[i].date.equals(date)) {
                System.out.println("Attendance record for " + date + ":");
                System.out.print("Time in: ");
                presenties[i].time_in.display();
                System.out.print("Time out: ");
                presenties[i].time_out.display();
                return;
            }
        }
        System.out.println("No attendance record found for " + date);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Attendances: ");
        for (int i = 0; i < na; i++) {
            System.out.println("- Date: " + presenties[i].date);
            System.out.print("  Time in: ");
            presenties[i].time_in.display();
            System.out.print("  Time out: ");
            presenties[i].time_out.display();
        }
        System.out.println();
    }
}
