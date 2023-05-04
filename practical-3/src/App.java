import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CollegeStudent[] allStudents = new CollegeStudent[1];
        for(int x = 0;x<1;x++){
            System.out.println("Which Stream has this student choosen: ");
            String stream = scanner.nextLine();
            if(stream.equalsIgnoreCase("placement")){
                System.out.println("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Student Gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter Student departmentName: ");
                String departmentname = scanner.nextLine();
                System.out.println("Enter Student CGPA: ");
                double CGPA = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter Student industry name: ");
                String industryName = scanner.nextLine();
                System.out.println("Enter Student annual package: ");
                double aPackage = scanner.nextDouble();
                System.out.println("Enter Student joining letter number: ");
                int letterNumber = scanner.nextInt();
                scanner.nextLine();
                allStudents[x] = new PlacementStudent(name,gender,departmentname,CGPA,industryName,aPackage,letterNumber);
            }else if(stream.equalsIgnoreCase("startup")){
                System.out.println("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Student Gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter Student departmentName: ");
                String departmentname = scanner.nextLine();
                System.out.println("Enter Student CGPA: ");
                double CGPA = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter Student Company name: ");
                String cName = scanner.nextLine();
                System.out.println("Enter Student Sector: ");
                String sector = scanner.nextLine();
                System.out.println("Enter Student Company Employees Strength: ");
                int nEmployees = scanner.nextInt();
                System.out.println("Enter Student Company Turnover: ");
                double aTurnover = scanner.nextDouble();
                scanner.nextLine();
                allStudents[x] = new EnterPreneurshipStudent(name, gender, departmentname, CGPA, cName, sector, nEmployees, aTurnover);
            }else if(stream.equalsIgnoreCase("hStudies")){
                System.out.println("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Student Gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter Student departmentName: ");
                String departmentname = scanner.nextLine();
                System.out.println("Enter Student CGPA: ");
                double CGPA = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter Student Degree Name: ");
                String dname = scanner.nextLine();
                System.out.println("Enter Student College Name: ");
                String collegename = scanner.nextLine();
                System.out.println("Enter Student departmentName: ");
                int letterNumber = scanner.nextInt();
                allStudents[x] = new HigherStudiesStudent(name, gender, departmentname, CGPA, dname, collegename, letterNumber);
            }
        }

        for(CollegeStudent student:allStudents){
            System.out.println(student);
        }

        scanner.close();

        
    }
}
