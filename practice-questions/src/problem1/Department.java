package problem1;


public class Department {
    public String name;
    public Student[] students;
    public Teacher[] teachers;

    public Department(String name, Student[] students, Teacher[] teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    public double getAverageTeacherAge(){
        double sum = 0;
        for (Teacher teacher : teachers) {
            sum += teacher.getAge();
        }
        return sum / teachers.length;
    }

    public double getAverageStudentAge(){
        double sum = 0;
        for (Student student : students) {
            sum += student.getAge();
        }
        return sum / students.length;
    }

    public double getMinTeacherAge(){
        double min = teachers[0].getAge();
        for (Teacher teacher : teachers) {
            if (teacher.getAge() < min) {
                min = teacher.getAge();
            }
        }
        return min;
    }

    public double getMaxTeacherAge(){
        double max = teachers[0].getAge();
        for (Teacher teacher : teachers) {
            if (teacher.getAge() > max) {
                max = teacher.getAge();
            }
        }
        return max;
    }

    public double getAverageCGPA(){
        double sum = 0;
        for (Student student : students) {
            sum += student.getCgpa();
        }
        return sum / students.length;
    }

    public double getAverageCGPAforSemester(int semester){
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getSemester() == semester) {
                sum += student.getCgpa();
                count++;
            }
        }
        return sum / count;
    }

    public String toString() {
        String studentString = "";
        for (Student student : students) {
            studentString += student.toString() + "\n";
        }
        String teacherString = "";
        for (Teacher teacher : teachers) {
            teacherString += teacher.toString() + "\n";
        }
        return "Department: " + this.name + "\nStudents:\n" + studentString + "\nTeachers:\n" + teacherString;
    }



}
