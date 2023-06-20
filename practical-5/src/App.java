public class App {
    public static void main(String[] args) throws Exception {
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
