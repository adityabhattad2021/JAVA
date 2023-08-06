import java.util.ArrayList;

public class OfficeClass {

    private ArrayList<EmployeeClass> allEmployees = new ArrayList<>();

    public OfficeClass() {
        allEmployees.add(new EmployeeClass("Employee 1", "Cradle", "Gaming", "HR Manager", null));
        for (int x = 2; x < 14; x++) {
            if (x < 5) {
                allEmployees.add(new EmployeeClass(String.format("Employee %d", x), "Cradle", "Gaming",
                        "Project Manager", allEmployees.get(0)));
            } else if (x < 9) {
                if (x == 5) {
                    allEmployees.add(
                            new EmployeeClass(String.format("Employee %d", x), "Cradle", "Gaming", "Team Leader",
                                    allEmployees.get(1)));
                } else if (x == 6) {
                    allEmployees.add(
                            new EmployeeClass(String.format("Employee %d", x), "Cradle", "Gaming", "Team Leader",
                                    allEmployees.get(2)));
                } else {
                    allEmployees.add(
                            new EmployeeClass(String.format("Employee %d", x), "Cradle", "Gaming", "Team Leader",
                                    allEmployees.get(3)));
                }
            } else {
                if (x == 9) {
                    allEmployees
                            .add(new EmployeeClass(String.format("Employee %d", x), "Cradle", "Gaming", "Developer",
                                    allEmployees.get(4)));
                } else if (x < 12) {
                    allEmployees
                            .add(new EmployeeClass(String.format("Employee %d", x), "Cradle", "Gaming", "Developer",
                                    allEmployees.get(5)));
                } else {
                    allEmployees
                            .add(new EmployeeClass(String.format("Employee %d", x), "Cradle", "Gaming", "Developer",
                                    allEmployees.get(7)));
                }
            }
        }
    }

    public void displayAllEmployees() {
        for (EmployeeClass e : allEmployees) {
            System.out.println(e);
        }
    }

    public void displayAllManagers(int employeeNumber) {
        EmployeeClass e = allEmployees.get(employeeNumber - 1);
        EmployeeClass reportingManager = e.getReportingManager();
        if (reportingManager != null) {
            System.out.println(reportingManager);
            int indexOfReportingManager = allEmployees.indexOf(reportingManager);
            displayAllManagers(indexOfReportingManager + 1);
        }

    }

    public void displayByPosition(String position) {
        for (EmployeeClass e : allEmployees) {
            if (e.getPosition().equalsIgnoreCase(position)) {
                System.out.println(e);
            }
        }
    }

}
