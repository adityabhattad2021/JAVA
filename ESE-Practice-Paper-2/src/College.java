import java.util.ArrayList;

public class College {

    private ArrayList<Student> allStudents = new ArrayList<>();

    public College() {
        // Generated using ChatGPT.
        allStudents.add(new ToBeEnterpreneur("Rahul", "Computer Science", 8.5, "1234567890", "Tech Startup",
                "Technology", 20, 1000000));
        allStudents.add(new ToBeEmployee("Sneha", "Electrical Engineering", 9.0, "9876543210", "Tech Company",
                "8 Lakhs", "JL1234"));
        allStudents.add(new ToBePostgraduate("Amit", "Mechanical Engineering", 7.8, "4567890123", "Stanford University",
                "2023", 5678, "GRE", 320));
        allStudents.add(new ToBeEnterpreneur("Priya", "Chemical Engineering", 8.9, "8901234567", "Fashion Boutique",
                "Fashion", 15, 750000));
        allStudents.add(new ToBeEmployee("Vikram", "Business Administration", 8.2, "7890123456", "Engineering Firm",
                "6 Lakhs", "JL5678"));
        allStudents.add(new ToBePostgraduate("Anjali", "Economics", 9.5, "9012345678", "Harvard University", "2024",
                9876, "GMAT", 710));
        allStudents.add(new ToBeEnterpreneur("Manish", "Civil Engineering", 7.0, "2345678901", "Hospitality Business",
                "Hospitality", 30, 2000000));
        allStudents
                .add(new ToBeEmployee("Kavita", "Physics", 8.7, "6789012345", "Pharma Company", "12 Lakhs", "JL9876"));
        allStudents.add(
                new ToBePostgraduate("Sachin", "Mathematics", 9.2, "3456789012", "MIT", "2022", 5432, "TOEFL", 115));
        allStudents.add(new ToBeEnterpreneur("Neha", "English Literature", 8.3, "8901234567", "Design Studio", "Design",
                10, 500000));
    }

    public void displayAllStudents(){
        for(Student student:allStudents){
            System.out.println(student);
        }
    }
}
