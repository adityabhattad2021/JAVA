package problem1;
import problem1.*;

public class App {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[3];
        Teacher[] teachers = new Teacher[3];

        students[0] = new Student("Atul", "01/01/2000", 1, 1, 3.5);
        students[1] = new Student("Rahul", "01/01/2000", 2, 1, 3.5);
        students[2] = new Student("Rohit", "01/01/2000", 3, 1, 3.5);

        teachers[0] = new Teacher("Rajesh", "01/01/1980",  "PG", 10);
        teachers[1] = new Teacher("Ramesh", "01/01/1980", "PG", 5);
        teachers[2] = new Teacher("Rakesh", "01/01/1980", "PG", 3);

        Department department = new Department("CSE", students, teachers);

        System.out.println("Average Teacher Age: " + department.getAverageTeacherAge());
        System.out.println("Average Student Age: " + department.getAverageStudentAge());
        System.out.println("Min Teacher Age: " + department.getMinTeacherAge());
        System.out.println("Max Teacher Age: " + department.getMaxTeacherAge());
        System.out.println("Average CGPA: " + department.getAverageCGPA());
        System.out.println("Average CGPA for Semester 1: " + department.getAverageCGPAforSemester(1));
        System.out.println("Salary of Teacher 1: " + teachers[0].getSalary());
        System.out.println("Salary of Teacher 2: " + teachers[1].getSalary());
        System.out.println("Salary of Teacher 3: " + teachers[2].getSalary());

        System.out.println(department);
    }
}
