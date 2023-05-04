public abstract class CollegeStudent {
    public String name;
    public String gender;
    public String departmentName;
    public double CGPA;

    CollegeStudent(String name,String gender,String departmentName,double CGPA){
        this.name = name;
        this.gender = gender;
        this.departmentName = departmentName;
        this.CGPA = CGPA;
    }

    @Override
    public String toString(){
        return "Student Name: "+name+".\n"+"Student Gender: "+gender+".\n"+"Student Department Name: "+departmentName+".\n"+"Student CGPA: "+CGPA+".\n";
    }
    
}
