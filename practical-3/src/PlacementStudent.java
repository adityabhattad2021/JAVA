public class PlacementStudent extends CollegeStudent{
    public String industryName;
    public double annualPackage;
    public int joiningLetterNumber;

    PlacementStudent(String name,String gender,String departmentName,double CGPA,String industryName,double annualpackage,int joiningLetterNumber){
        super(name,gender,departmentName,CGPA);
        this.industryName=industryName;
        this.annualPackage = annualpackage;
        this.joiningLetterNumber=joiningLetterNumber;
    }

    @Override
    public String toString(){
        return super.toString() + "Student Industry Name: "+industryName+".\n"+"Student Annual Package: "+annualPackage+".\n"+"Student Joining Letter Number: "+joiningLetterNumber+".\n";
    }

}
