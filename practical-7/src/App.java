import java.util.Scanner;

import question10.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Phonedirectory phoneDirectory = new Phonedirectory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter student name");
            String name = scanner.nextLine();
            System.out.println("Enter student roll no");
            int rollNo = scanner.nextInt();
            System.out.println("Enter student city");
            scanner.nextLine();
            String city = scanner.nextLine();
            System.out.println("Enter student semester");
            int semester = scanner.nextInt();
            try{
                if(name.equalsIgnoreCase("") || city.equalsIgnoreCase("") || rollNo==0 || semester==0){
                    throw new Exception("Fill all the arguments");
                }
                Student s = new Student(rollNo, name, semester, city);
                phoneDirectory.addStudent(s);
            }catch(Exception e){
                e.printStackTrace();    
            }
            int toStop=0;
            System.out.println("Press 1 to stop");
            toStop = scanner.nextInt();
            if(toStop==1){
                break;
            }
        }

        phoneDirectory.viewAllStudents();

        phoneDirectory.viewStudentsByCity("nagpur");
        scanner.close();

    //      MyArry<Integer> myArray = new MyArry<>(5);

    //     // Adding elements to the array
    //     myArray.add(10);
    //     myArray.add(20);
    //     myArray.add(30);
    //     myArray.add(40);
    //     myArray.add(50);
    //     myArray.add(60);
    //     myArray.add(70);
    //     myArray.add(70);
    //     myArray.add(70);
    //     myArray.add(70);
    //     myArray.add(70);

    //     // Printing the initial array
    //     System.out.println("Initial array:");
    //     for (int i = 0; i < myArray.getNoofElement(); i++) {
    //         System.out.print(myArray.get(i)+ " ");
    //     }
    //     System.out.println();

    //     // Swapping elements at indexes 1 and 3
    //     myArray.swap(1, 3);

    //     // Printing the array after swapping
    //     System.out.println("Array after swapping:");
    //    for (int i = 0; i < myArray.getNoofElement(); i++) {
    //         System.out.print(myArray.get(i) + " ");
    //     }
    //     System.out.println();

    }
}
