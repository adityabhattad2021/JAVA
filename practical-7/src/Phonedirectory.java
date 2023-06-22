import java.util.ArrayList;
import java.util.Collections;

public class Phonedirectory {
    
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        students.add(s);
        Collections.sort(students);
    }

    public void removeStudent(Student s){
        students.remove(s);
        Collections.sort(students);
    }

    public void viewAllStudents(){
        for(Student s:students){
            System.out.println(s);
        }
    }

    public void viewStudentsByCity(String city){
        for(Student s:students){
            if(city.equalsIgnoreCase(s.getCity())){
                System.out.println(s);
            }
        }
    }

}
