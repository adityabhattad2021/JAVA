public class ToBeEnterpreneur extends Student {

    private String companyName;
    private String sector;
    private int numberOfEmployees;
    private double annualTurnOver;

    public ToBeEnterpreneur(String name, String departmentName, double cGPA, String phoneNumber, String companyName,
            String sector, int numberOfEmployees, double annualTurnOver) {
        super(name, departmentName, cGPA, phoneNumber);
        this.companyName = companyName;
        this.sector = sector;
        this.numberOfEmployees = numberOfEmployees;
        this.annualTurnOver = annualTurnOver;
    }

    public String toString() {
        return super.toString() + String.format(
                "\nStudent Company Name: %s\nStudent Company Sector: %s\nStudent Company Number Of Employees: %d\nStudent Company AnnualTurnOver: %.2f",
                this.companyName,
                this.sector,
                this.numberOfEmployees,
                this.annualTurnOver);
    }

}
