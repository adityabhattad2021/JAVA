abstract class Person {

    private String name;
    private String dateOfBirth;

    Person(String name,String dob){
        this.name=name;
        this.dateOfBirth=dob;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
}


class Employee extends Person {

    private String salary;
    private String designation;

    Employee(String name,String dob,String salary,String designation){
        super(name,dob);
        this.salary=salary;
        this.designation=designation;
    }

    public String getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }
}

class Student extends Person {
    private String CGPA;
    private String branch;

    Student(String name,String dob,String CGPA,String branch){
        super(name,dob);
        this.CGPA = CGPA;
        this.branch = branch;
    }

    public String getCGPA() {
        return CGPA;
    }

    public String getBranch() {
        return branch;
    }
}