package problem1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teacher extends Person {
    public String salary;
    public String qualification;
    public int experience;

    public Teacher(String name, String dateOfBirth, String qualification, int experience) {
        super(name, dateOfBirth);
        this.qualification = qualification;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return LocalDate.now().getYear()
                - LocalDate.parse(this.dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
    }

    public String getSalary() {
        if(qualification.equalsIgnoreCase("pg")){
            int baseSalary = 60000;
            int increment = experience * 2000;
            return String.valueOf(baseSalary + increment);
        }
        else if(qualification.equalsIgnoreCase("phd")){
            int baseSalary = 80000;
            int increment = experience * 2000;
            return String.valueOf(baseSalary + increment);
        }
        else{
            return "Invalid Qualification";
        }
    }

    public String getQualification() {
        return qualification;
    }

    public int getExperience() {
        return experience;
    }

    public String toString() {

        double age = LocalDate.now().getYear()
                - LocalDate.parse(this.dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
        return "Name: " + this.name + "\nAge: " + age + "\nSalary: " + this.getSalary() + "\nQualification: "
                + this.qualification + "\nExperience: " + this.experience;
    }

}
