

public class ToBePostgraduate extends Student {

    private String newCollegeName;
    private String graduationYear;
    private int addmissionLetterNumber;
    private String competativeExamName;
    private int competativeScore;

    
    public ToBePostgraduate(String name, String departmentName, double cGPA, String phoneNumber, String newCollegeName,
            String graduationYear, int addmissionLetterNumber, String competativeExamName, int competativeScore) {
        super(name, departmentName, cGPA, phoneNumber);
        this.newCollegeName = newCollegeName;
        this.graduationYear = graduationYear;
        this.addmissionLetterNumber = addmissionLetterNumber;
        this.competativeExamName = competativeExamName;
        this.competativeScore = competativeScore;
    }

    public String toString(){
        return super.toString()+String.format("\nStudent New College Name: %s\nStudent Graduation Year: %s\nStudent Addmission Letter Number: %s\nStudent Competative Exam Details: (Name:%s Score:%d)",
            this.newCollegeName,
            this.graduationYear,
            this.addmissionLetterNumber,
            this.competativeExamName,
            this.competativeScore
        );
    }

}
