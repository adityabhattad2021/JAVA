public abstract class Student {
    private String name;
    private String departmentName;
    private double CGPA;
    private String phoneNumber;

    public Student(String name, String departmentName, double cGPA, String phoneNumber) {
        this.name = name;
        this.departmentName = departmentName;
        CGPA = cGPA;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return String.format(
                "\n\nStudent Name: %s\nStudent Department: %s\nStudent CGPA: %.2f\nStudent Phone Number: %s",
                this.name,
                this.departmentName,
                this.CGPA,
                this.phoneNumber);
    }

}
