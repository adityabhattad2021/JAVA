public class ToBeEmployee extends Student {

    private String industryName;
    private String annualPackage;
    private String joiningLetter;

    public ToBeEmployee(String name, String departmentName, double cGPA, String phoneNumber, String industryName,
            String annualPackage, String joiningLetter) {
        super(name, departmentName, cGPA, phoneNumber);
        this.industryName = industryName;
        this.annualPackage = annualPackage;
        this.joiningLetter = joiningLetter;
    }

    public String toString() {
        return super.toString()
                + String.format("\nStudent Industry Name: %s\nStudent Auuual Package: %s\nStudent Joining Letter: %s",
                        this.industryName,
                        this.annualPackage,
                        this.joiningLetter);
    }
}
