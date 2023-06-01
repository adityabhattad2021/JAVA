public class Employee {
    private String companyName;
    private String department;
    private String position;
    private String name;
    private Employee reportingManager;

    public Employee(String name,String companyName,String department,String position,Employee reportingManager){
        this.name=name;
        this.companyName=companyName;
        this.department=department;
        this.position=position;
        this.reportingManager=reportingManager;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public Employee getReportingManager() {
        return reportingManager;
    }

}
