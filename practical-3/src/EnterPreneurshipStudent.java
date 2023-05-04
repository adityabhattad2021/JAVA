public class EnterPreneurshipStudent extends CollegeStudent{
    public String companyName;
    public String sector;
    public int numberOfEmployees;
    public double annualTurnover;

    EnterPreneurshipStudent(String name,String gender,String departmentName,double CGPA,String companyName,String sector,int numberOfEmployees,double annualTurnover){
        super(name,gender,departmentName,CGPA);
        this.companyName = companyName;
        this.sector=sector;
        this.numberOfEmployees=numberOfEmployees;
        this.annualTurnover=annualTurnover;
    }

    @Override
    public String toString(){
        return super.toString() + "Student Company Name: "+companyName+".\nStudent Sector: "+sector+".\nStudent Number Of Employees: "+numberOfEmployees+".\nStudent Annual Turnover: "+annualTurnover+".\n";
    }
}
