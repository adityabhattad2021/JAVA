import CustomExecptions.*;

public class Student {
    private String name;
    private double CGPA;
    private String enrolmentNumber;
    private String password;

    Student(String name,double CGPA,String enrolemtNumber,String password){
        setName(name);
        try{
            setCGPA(CGPA);
            setEnrolmentNumber(enrolemtNumber);
            setPassword(password);
        } catch (InvalidCGPAExecption e){
            System.out.println(e.getMessage());
        } catch(InvalidEnrollmentNumberExecption e){
            System.out.println(e.getMessage());
        } catch(InvalidPasswordExecption e){
            System.out.println(e.getMessage());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cGPA) throws InvalidCGPAExecption {
        if (cGPA >= 0.0 && cGPA <= 10.0) {
            this.CGPA = cGPA;
        } else {
            throw new InvalidCGPAExecption(String.format("%f Not a valid CGPA", cGPA));
        }
    }

    public void setEnrolmentNumber(String enrolmentNumber) throws InvalidEnrollmentNumberExecption {
        String[] validYear = { "20", "21", "22", "23" };
        String[] validBranches = { "CSU", "ENU", "ECU", "EEU" };
        if (enrolmentNumber.substring(0, 2).equalsIgnoreCase("be")) {
            for (String y : validYear) {
                if (y.equals(enrolmentNumber.substring(2, 4))) {
                    for (String branch : validBranches) {
                        if (branch.equals(enrolmentNumber.substring(4, 7))) {
                            if (Integer.parseInt(enrolmentNumber.substring(7)) >= 1
                                    && Integer.parseInt(enrolmentNumber.substring(7)) <= 250) {
                                this.enrolmentNumber = enrolmentNumber;
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new InvalidEnrollmentNumberExecption(
                String.format("%s is not a valid enrollment number", enrolmentNumber));
    }
    

    public boolean checkPassword(String pass) {
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean specialCharatersFlag = false;
        char[] specialCharaters = {'!', '$', '%', '&'};
    
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
    
            if (Character.isDigit(ch)) {
                numberFlag = true;
            } else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            } else {
                for (int j = 0; j < specialCharaters.length; j++) {
                    if (ch == specialCharaters[j]) {
                        specialCharatersFlag = true;
                        break;
                    }
                }
            }
        }
    
        return numberFlag && capitalFlag && lowerCaseFlag && specialCharatersFlag;
    }

    public void setPassword(String password) throws InvalidPasswordExecption {
        
        if(checkPassword(password)){
            this.password = password;
        } else {
            throw new InvalidPasswordExecption(String.format("%s is not a valid password", password));
        }
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }

    public String getEnrolmentNumber() {
        return enrolmentNumber;
    }

    public String getPassword() {
        return password;
    }
}
