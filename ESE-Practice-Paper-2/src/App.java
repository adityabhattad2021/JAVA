import java.time.LocalDate;
import java.util.*;
import java.io.*;

public class App {

    /*
     * Government of India has started online registrations for Voter ID. It
     * takes Name, City and Date of Birth from the user. Design a Java Code
     * to take input from user. Design a function which will compute the
     * age. The age is calculated with respect to system date. If the age of
     * user is greater than 18 then he can proceed with the registration
     * process else the system gives the message that user is underage.
     * The format in which the user will enter date of birth is
     * DD/MM/YYYY and data type of DOB is string.
     */
    // public static void main(String[] args) throws Exception {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter Name, City and Dob");
    // String name = scanner.nextLine();
    // String city = scanner.nextLine();
    // String Dob = scanner.nextLine();
    // int birthYear = Integer.parseInt(Dob.substring(Dob.length() - 4,
    // Dob.length()));
    // int currentYear = LocalDate.now().getYear();
    // if (currentYear - birthYear > 18) {
    // System.out.println("You can pass for further registration.");
    // } else {
    // System.out.println("You are underage for registration");
    // }
    // scanner.close();
    // }

    /*
     * What is a constructor? Consider a class “A” which has a private
     * constructor A() and a default constructor A(int x). How will we
     * create objects of this class if we have to call a default constructor? Is it
     * possible to create objects of the class outside the package?
     * 
     * Constructor is the special function is JAVA that only runs only once, that is
     * while the initialization of the object of the following class.
     * The above example is of method overloading and compile time polymorphism.
     * If we have to call the default constructor we will use the following syntax
     * `A a = new A()` and pass no int variable in the class, this way the
     * constructor with no int input variable will be called. If we have to create
     * objects outside the package we will have to first mark the class and its
     * constructor as public as by default JAVA used `default` access modifier, in
     * which any keywords marked with default access modifier is only available
     * inside the package.
     */

    /*
     * Write a program to implement Inheritance, method overriding and
     * runtime polymorphism. Consider the following scenario:- A college
     * stores the student information as Name, Department Name, CGPA,
     * Phone Number. College also stores the placement details as industry
     * name, annual package and joining letter number. If the student is
     * going for higher studies then the details are stored as Degree Name,
     * College Name, Graduation Year, Admission Letter Number,
     * Competitive exam details(Name, Score). If student is going for
     * Entrepreneurship then information stored is Company Name, Sector,
     * Number of employees working in the company and annual turnover.
     * Create an efficient way to store and display details of all students in
     * an array.
     */
    // public static void main(String[] args) throws Exception {
    // College college = new College();

    // college.displayAllStudents();
    // }

    /*
     * If we have a function fun1() in base class and fun1() in derived class,
     * and we create object of derived class and call fun1(), which method
     * will be called. If we modify fun1() to fun1(int a) in derived class,
     * what will be the output?
     * 
     * Case 1: If we create object of derived class and call fun1()
     * It will call the method defined inside the child class, here dynamic method
     * dispatch will come into play.
     * 
     * Case 2: If we modify fun1() to fun1(int a) in derived class
     * It will this time call the method inside the parent class if fun1() is called
     * without any input, here compile time polymorphism is achieved using object
     * overloading.
     * 
     */

    /*
     * Create a class Account which stores basic information about user
     * such as name, address, account number and balance. It provides
     * functionalities for deposit, withdraw and display account
     * information. In withdraw facility if the user tries to withdraw more
     * money throw a user defined exception InsufficientFundException.
     * Use proper exception handling techniques. Give proper working of
     * exception class InsufficientFundException.
     */
    // public static void main(String[] args) {
    // Account account = new Account("Pratik", "Pune", "28563814", 329489);
    // account.deposit(2112);
    // account.withdraw(453753);
    // System.out.println(account);
    // }

    /*
     * Write a java function to print the contents of the directory. If the
     * directory contains the sub directory with “fol” as part of subdirectory
     * name then the contents of sub directory should also be printed.
     */
    // public static void printTheContentOfDirectories(String directoryName, int
    // spaces) {
    // File file = new File(directoryName);
    // if (file.isDirectory()) {
    // for (int x = 0; x < spaces; x++) {
    // System.out.printf(" ");
    // }
    // System.out.printf("Directory Name: %s\n", file.getName());
    // File[] allChildrens = file.listFiles();
    // for (File child : allChildrens) {
    // if (child.isDirectory()) {
    // printTheContentOfDirectories(child.getAbsolutePath(), spaces + 4);
    // } else {
    // for (int x = 0; x < spaces * 2; x++) {
    // System.out.printf(" ");
    // }
    // System.out.printf("File Name: %s\n", child.getName());
    // }
    // }

    // } else {
    // System.out.printf(" File Name: %s\n", file.getName());
    // }
    // spaces++;
    // }

    // public static void main(String[] args) throws Exception {
    // String currentDirectory = System.getProperty("user.dir");
    // // System.out.println(currentDirectory);
    // printTheContentOfDirectories("C:\\Users\\adity\\Desktop\\JAVA\\ESE-Practice-Paper-2\\",
    // 0);
    // }

    /*
     * Create a generic method which will return average of numbers. How
     * is this different from generic class?
     * => In Generic class variable T is declared at class level, which is aplicable
     * inside the entire class and all its method, while in generic method the
     * variable type is declared only at the class level so that it is only
     * applicable inside the method, Generic methods allows to have more fine
     * grained control over how the types are used in the method and gives
     * flexibility over how the given methods will function inside the class.
     */
    // public static <T extends Number> Double averageOfNumbers(ArrayList<T>
    // numbers) {
    // if (numbers.isEmpty()) {
    // throw new IllegalArgumentException("Array of numbers is empty");
    // }
    // double sum = 0;
    // for (T number : numbers) {
    // sum += number.doubleValue();
    // }
    // return sum / numbers.size();
    // }

    // public static void main(String[] args) {
    // ArrayList<Number> numbers = new ArrayList<>();
    // numbers.add(10.00);
    // numbers.add(10);
    // numbers.add(10);
    // double average = averageOfNumbers(numbers);
    // System.out.printf("Average of the numbers is %.2f",average);
    // }

    /*
     * A company “SWK” wants functionality that if an employee detail is
     * stored, it will be stored sorted according to the designation. If the
     * designation is same then it will be sorted on salary. Design an
     * efficient way of storing it. The employee class stores
     * Employee_name, Designation and salary.
     * The Designations provided are:-
     * Manager-1
     * Assistant Manager-2
     * Clerk-3
     * Worker-4
     */
    // public static void main(String[] args) {
    // SWK swk = new SWK();
    // swk.displayAllEmployees();
    // }

    /*
     * Write a program to create a thread that read from file word by word
     * and store it in shared memory. Also create a thread which writes
     * from the shared memory to an output file. Write a main() to show the
     * simulation of 2 readers and a writer.
     */

    // public static void main(String[] args) {

    // // String currentDirectory = System.getProperty("user.dir");
    // // System.out.println(currentDirectory);
    // ArrayList<String> sharedMemory = new ArrayList<>();
    // FileReaderThread frThread = new FileReaderThread(sharedMemory);
    // FileWriterThread fwThread = new FileWriterThread(sharedMemory);

    // Thread readerThread1 = new Thread(new Runnable() {
    // @Override
    // public void run() {
    // frThread.readFile("input.txt");
    // }
    // });
    // Thread readerThread2 = new Thread(new Runnable() {
    // @Override
    // public void run() {
    // frThread.readFile("input1.txt");
    // }
    // });

    // Thread writerThread = new Thread(new Runnable() {

    // @Override
    // public void run() {
    // try {
    // Thread.sleep(1000);
    // fwThread.writeToOutputFile();
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }
    // });

    // readerThread1.start();
    // readerThread2.start();
    // writerThread.start();
    // }

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> sharedArray = new ArrayList<>();
        for (int x = 0; x < 20; x++) {
            sharedArray.add(x);
        }
        ArrayList<Integer> sum= new ArrayList<>();
        sum.add(0);
        SumAdder sumAdder = new SumAdder(sharedArray,sum);

        Thread sumAdderThread1 = new Thread(new Runnable() {
    
            @Override
            public void run() {
                sumAdder.calculateSum(0, 5);
            }

        });

        Thread sumAdderThread2 = new Thread(new Runnable() {
            

            @Override
            public void run() {
                sumAdder.calculateSum(5, 10);
            }

        });

        Thread sumAdderThread3 = new Thread(new Runnable() {
    
            @Override
            public void run() {
                sumAdder.calculateSum(10, 15);
            }

        });

        Thread sumAdderThread4 = new Thread(new Runnable() {
    
            @Override
            public void run() {
                sumAdder.calculateSum(15, 20);
            }

        });

        sumAdderThread1.start();
        sumAdderThread2.start();
        sumAdderThread3.start();
        sumAdderThread4.start();
        sumAdderThread1.join();
        sumAdderThread2.join();
        sumAdderThread3.join();
        sumAdderThread4.join();

        System.out.println(sum.get(0));
    }

}
