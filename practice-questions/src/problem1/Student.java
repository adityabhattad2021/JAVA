package problem1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student extends Person {
    public int rollNumber;
    public int semester;
    public double cgpa;

    public Student(String name, String dateOfBirth, int rollNumber, int semester, double cgpa) {
        super(name, dateOfBirth);
        this.rollNumber = rollNumber;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return LocalDate.now().getYear()
                - LocalDate.parse(this.dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getSemester() {
        return semester;
    }

    public String toString() {

        double age = LocalDate.now().getYear()
                - LocalDate.parse(this.dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
        return "Name: " + this.name + "\nAge: " + age + "\nRoll Number: " + this.rollNumber + "\nSemester: "
                + this.semester + "\nCGPA: " + this.cgpa;
    }
}
