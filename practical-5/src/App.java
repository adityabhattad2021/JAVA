
public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exception Handling
         * Create a class Student with data members as Name, CGPA, Enrolment number,
         * Password. Throw user defined exception if the following criteria are not met:
         * i. CGPA should be between 0 to 10
         * ii. Enrolment number should be in format BE18CSU105, valid year is from 20to
         * 23. Valid branches are CSU, ENU, ECU, EEU. Valid roll number is from 1 to
         * 250.
         * iii. Password should have minimum 8 characters. Must include 1 uppercase
         * letter, 1 small case letter, 1 number, 1 special symbol(!, $, %, *, &)
         * Use proper exception handling methods. Write main() to demonstrate the
         * working of class student.
         */

        // Creating a valid student object
        Student student1 = new Student("Vishnu Mahajan", 9.5, "BE21CSU001", "Password%123");
        System.out.println("Valid student object created:");
        System.out.println("Name: " + student1.getName());
        System.out.println("CGPA: " + student1.getCGPA());
        System.out.println("Enrollment Number: " + student1.getEnrolmentNumber());
        System.out.println("Password: " + student1.getPassword());

        // Creating an invalid student object
        Student student2 = new Student("Pradeep Gupta", 11.5, "BE23ENU300", "password123");
        System.out.println("Valid student object created:");
        System.out.println("Name: " + student2.getName());
        System.out.println("CGPA: " + student2.getCGPA());
        System.out.println("Enrollment Number: " + student2.getEnrolmentNumber());
        System.out.println("Password: " + student2.getPassword());

    }
}
