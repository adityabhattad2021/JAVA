public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int semester;
    private String city;


    Student(int rollNo,String name,int semester,String city){
        setCity(city);
        setName(name);
        setRollNo(rollNo);
        setSemester(semester);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }


    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int compareTo(Student s) {
        if(s.semester==this.semester){
            return Integer.compare(this.rollNo, s.rollNo);
        }
        return Integer.compare(this.semester,s.semester);
    }

    @Override
    public String toString(){
        return String.format("Student Name: %s\nStudent RollNo: %d\nStudent City: %s\nStudent Semester: %d",this.name,this.rollNo,this.city,this.semester);
    }



}
