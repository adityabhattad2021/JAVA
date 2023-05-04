public class HigherStudiesStudent extends CollegeStudent {
    public String degreeName;
    public String collegeName;
    public int addmissionLetterNumber;

    HigherStudiesStudent(String name, String gender, String departmentName, double CGPA, String degreeName,
            String collegeName, int addmissionLetterNumber) {
        super(name, gender, departmentName, CGPA);
        this.degreeName = degreeName;
        this.collegeName = collegeName;
        this.addmissionLetterNumber = addmissionLetterNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "Student Degree Name: " + degreeName + ".\nStudent College Name: " + collegeName
                + ".\nStudent Addmission Letter Number: " + addmissionLetterNumber + ".\n";
    }

}
