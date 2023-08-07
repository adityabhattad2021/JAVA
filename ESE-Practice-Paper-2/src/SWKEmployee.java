public class SWKEmployee {

    private String Employee_name;
    private SWKDesignationsENUM designation;
    private double salary;

    public SWKEmployee(String name, SWKDesignationsENUM designation, double salary) {
        this.Employee_name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public SWKDesignationsENUM getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return String.format("\n\nEmployee Name: %s\nEmployee Designation: %s\nEmployee Salary: %.2f",
                this.Employee_name,
                this.designation == SWKDesignationsENUM.MANAGER ? "Manager"
                        : this.designation == SWKDesignationsENUM.ASSISTANT_MANAGER ? "Assistant Manager"
                                : this.designation == SWKDesignationsENUM.CLERK ? "Clerk"
                                        : this.designation == SWKDesignationsENUM.WORKER ? "Worker" : "",
                this.salary);
    }

}
