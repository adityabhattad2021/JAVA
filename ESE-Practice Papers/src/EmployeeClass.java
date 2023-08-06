public class EmployeeClass {
    private String name;
    private String companyName;
    private String department;
    private String position;
    private EmployeeClass reportingManager;

    public EmployeeClass(String name, String companyName, String department, String position,
            EmployeeClass reportingManager) {
        this.name = name;
        this.companyName = companyName;
        this.department = department;
        this.position = position;
        this.reportingManager = reportingManager;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public EmployeeClass getReportingManager() {
        return reportingManager;
    }

    public String toString() {
        String reportingManagerName = (this.getReportingManager() != null) ? this.getReportingManager().getName()
                : "HR Manager has no one to report to :)";
        return String.format(
                "\nEmployee Name: %s\nEmployee Company Name: %s\nEmployee Department: %s\nEmployee Position: %s\nEmployee Reporting Manager: %s",
                this.name, this.companyName, this.department, this.position, reportingManagerName);
    }
}
