import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Employee {
    private String employeeId;
    private String password;
    private String regex = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$";

    Pattern p = Pattern.compile(regex);

    private Scanner scanner = new Scanner(System.in);

    public void setPassword() throws InvalidEmployeePassword {
        try {
            System.out.println("Enter the password: ");
            String input = scanner.nextLine();
            Matcher m = p.matcher(input);
            if (!m.matches()) {
                throw new InvalidEmployeePassword("Invalid Password");
            }
            this.password = input;
        } catch (InvalidEmployeePassword e) {
            System.out.println("There was an error while setting up employee password: " + e.getMessage() + "\nTry again");
            setPassword();
        }
    }

    public void setEmployee() throws InvalidEmployeeId {
        System.out.println("Enter the employee Id: ");
        String input = scanner.nextLine();
        String[] validIds = new String[150];
        String[] departmentNames = { "CS", "IT", "ECE" };
        int y = 0;
        for (String departmentName : departmentNames) {
            // System.out.println(departmentName);
            for (int x = 0; x < 50; x++) {
                if (x < 9 && !departmentName.equalsIgnoreCase("ece")) {
                    validIds[y] = departmentName + "00" + (x + 1);
                } else if (!departmentName.equalsIgnoreCase("ece")) {
                    validIds[y] = departmentName + "0" + (x + 1);
                } else if (x < 9) {
                    validIds[y] = departmentName + "0" + (x + 1);
                } else {
                    validIds[y] = departmentName + (x + 1);
                }
                y++;
            }
        }
        try {
            for (String id : validIds) {
                if (id.equals(input)) {
                    this.employeeId = input;
                    return;
                }
            }
            throw new InvalidEmployeeId("Invalid Employee Id");
        } catch (InvalidEmployeeId e) {
            System.out.println("There was an error while setting up employee id: " + e.getMessage() + "\nTry again");
            setEmployee();
        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Employee Id is " + this.employeeId + "\nEmployee password is " + this.password + "\n";
    }
}