// Example of constructor overloading.
public class Student {
    // Overloaded Constructors = Multile constructors within the same name, but have
    // different parameter
    // name + parameters = signature.

    String name;
    int rollNo;
    double CGPA;

    Student(String name, int rollNo, double CGPA) {
        this.name = name;
        this.rollNo = rollNo;
        this.CGPA = CGPA;
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.CGPA = 0;
    }

    Student(String name) {
        this.name = name;
        this.rollNo = 0;
        this.CGPA = 0;
    }

    Student() {
        this.name = "Not set";
        this.rollNo = 0;
        this.CGPA = 0;
    }

    void getStudent(){
        System.out.printf("\nStudent name is: %s\nStudent Roll Number is: %d\nStudent CGPA is: %f\n",this.name,this.rollNo,this.CGPA);
    }
}
