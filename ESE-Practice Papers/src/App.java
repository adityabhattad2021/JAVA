import java.io.*;
import java.sql.SQLException;

public class App {

    /*
     * Design a class Employee, having String companyname, String
     * dept, String position and Employee reportingManager.
     * Create another class Office having an array of employees where
     * each must have a manager except one. Write a method
     * displayAllManagersOf(Employee e) which will display all the
     * managers of employee e and a method displayAll(String position)
     * to display all employee working on that position.
     * [For example: Given a object hierarchy as follows:
     * 
     * Output of displayAllManagersOf(object13), must display details of
     * below employee objects in the given order:-> object8, object4,
     * object1
     * Output of displayAll(“ProjectManager”) must display the details
     * of object2, object3 and object4]
     */
    // public static void main(String[] args) throws Exception {
    // OfficeClass office = new OfficeClass();
    // // office.displayAllEmployees();
    // office.displayAllManagers(11);
    // // office.displayByPosition("HR Manager");
    // }

    /*
     * What is an interface? Why is it used in Java? Can we create an
     * anonymous class using an interface? Demonstrate with an
     * example.
     * Explain the concept of functional interfaces and how they are used
     * for writing Lambda Expressions. Illustrate with sample code how
     * lambda expressions significantly reduce the lines of code in a Java
     * program.
     * 
     * => Interface can be considered as the set of rules, that a class has to
     * follow once the class inheirts from any interface, these rules can be which
     * functions the class should be implementing, which variable that class will
     * have etc, It is kind of a blue prints for the class, The interfaces are also
     * useful for implementing dynamic method dispatch in Java. By allowing a single
     * object reference of an interface type to call differnet methods based on the
     * actual implementation defined in their original classes.
     * Yes we can create an anonymous call using an interface in Java.
     * Functional interfaces are the interfaces, are the interfaces that have single
     * abstract method and this specified inside them, in Java these are useful when
     * We have to create anonymous classes and also makes them eligible to be used
     * within functional interfaces, anonymous class are the classes that can be
     * created inside the class, it highly reduces the amount of code that is needed
     * to written as, anonymous class can be written with a single line of code like
     * `AnonymousClass aC = new AnonymousClass {...code} Lambda expression make it
     * even more simpler to implement anomymous classes using iterfaces as it simply
     * infers the type of the interface, making the code even shorter. Example of
     * the code given below, demostrates use of anonymous classes, functional
     * interfaces and lambda expressions.
     */
    // public static void main(String[] args) throws Exception {
    // InterfaceExample interfaceExample = () -> {
    // System.out.println("Doing something");
    // };

    // interfaceExample.doSomething();
    // }

    /*
     * Explain the following terms related to exception handling in Java:
     * 
     * A. try
     * B. catch
     * C. throw
     * D. throws
     * E. finally
     * Can a try catch block replace a conditional statement like if-else or
     * switch case? If yes, then how? If no, then why?
     * 
     * Try: In Java, when developer expectes cretain line of code to throw an error,
     * or in other words cretain methods are exected to throw error of certian
     * conditions that are beyond developers control than these lines of code can be
     * written within the try block of code.
     * Catch: This is immediatly written after try block of code and the error
     * thrown from the try block can be handled in the catch block of code.There can
     * be multiple catch block after one try block.
     * Throw: throw is a special keyword in Java, it is used to throw an exception
     * on purpose on certain conditions.
     * Throws: throws is also a keyword in Java, when any method in java is expected
     * to throw an error, which is unhandled inside it and is expected to be handle
     * out side of the method, maybe from where it is called, then that method can
     * be marked with keyword throws.
     * Finally: It is a block of code that is written after the try and catch block
     * of code and inside the finally block, the code to be executed irrespective of
     * where there was an exception or not, is written.
     * 
     * example syntax `try {...some code, throw new SomeException}
     * catch(SomeException e){...code to handle that exception} finally {...code to
     * be executed irresptive of whether that execption arrised or not}`
     * 
     * No, try and catch block can not directly replace conditinal statements, as
     * Coditional Statements are used for making disicions based on specific
     * conditions and controlling the flow f the program based on those conditions.
     * They are used for handling expected and known conditions in the code.
     * On other hand, Try and Catch blocks are used to handle unexpected exceptions
     * during the execution of the code, When an exception occours in the try block
     * of code, it is caught and handled in the catch block of code, preventing the
     * program to terminate abrubtly.
     * While it is possible to use try and catch block in certain scenarios that
     * might be addressed with the conditional variables, but it can not be direct
     * replacement. Using try and catch block to handle all the scenarios that could
     * be managed with conditional statements will be considered as, simply bad
     * design.
     */

    /*
     * Describe how we can create a serializable object and write it to a
     * file? Also demonstrate with the help of a program how will
     * serialization work if the object contains references to other user
     * defined datatypes?
     * Will serialization work if the object to be written contains an
     * Arrayist? Why?
     * 
     * We can create a serializable object, by making that object inherit from the
     * serializable interface, this allows to object to be able to get written in
     * the file or get send from one program to the other program. After making the
     * object serializable, In the App class (Outside the object implementation) We
     * can instantiate the object, and Write the object to a file using helper class
     * FileWriter ObjectOutputStream.
     * 
     * If object contain refrence to other user defined data, This data will be
     * serialized and deserialized with the object itself.
     * 
     * Here is a sample program to demonstrate how we can write the object to a
     * file.
     */
    // public static void main(String[] args) throws Exception{
    // SerailizableExample originalClass = new SerailizableExample("Some Very
    // Important Data, it is also very very secret");
    // FileOutputStream fileOutputStream = new FileOutputStream(new
    // File("it-contains-sample-serailizable-object.ser"), true);
    // ObjectOutputStream objectOutputStream = new
    // ObjectOutputStream(fileOutputStream);

    // objectOutputStream.writeObject(originalClass);

    // objectOutputStream.close();
    // fileOutputStream.close();

    // FileInputStream fileInputStream = new FileInputStream(new
    // File("it-contains-sample-serailizable-object.ser"));
    // ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    // try{
    // while (true) {
    // SerailizableExample duplicateObject = (SerailizableExample)
    // objectInputStream.readObject();
    // System.out.println(duplicateObject.getSomeData());
    // duplicateObject.printArray();
    // }
    // }catch(EOFException e){
    // System.out.println("End of the file.");
    // }finally {
    // objectInputStream.close();
    // fileInputStream.close();
    // }
    // }

    /*
     * Design a class Laptop having features String model_name, double
     * screen size, int RAM, int disk_size, boolean hasSSD and double
     * cost.
     * Write a class MarketPlace having a collection of Laptops, where
     * users can view all Laptops according to sorted order (descending
     * or ascending) of cost, disk size, RAM, and screen_size.
     */
    // public static void main(String[] args) {
    // MarketPlace marketPlace = new MarketPlace();
    // // marketPlace.displayAccordingToCost();
    // marketPlace.displayAccordingToDiskSize();
    // }

    /*
     * Write a brief note on thread synchronization techniques in Java.
     * 
     * // * Thread Synchronization, is a Java to run multiple threads of a single
     * process seperately. When use threads to run a perticular part of code the
     * execution line of the code seperates from the main code flow that is, if the
     * main programs throws any array and crashes the code that is inside the
     * runnign thread will still get executed seperately. There are different ways
     * to achieve process synchronization in JAVA, such has using threads class, or
     * using runnable interface, once the thread is decelared using runnable or
     * thread. the function run must be implemented inside the class that inherits
     * the runnable or threads class, not to start the executionof the thread in
     * parent class `<classname>.start()` is needed to be called this line will
     * trigger the run method which we implemented in the class, with its on
     * independent execution line. Thread synchronization is used to coordinate the
     * execution of multiple threads to avoid data inconsistancies and race
     * conditions. In java the synchronizations can be achieved by writing the
     * critical section of code, with using synchronized key word
     * `synchronized(<shared variable here>) {...code}
     * Now any code written inside the synchronized block of will be only accessed
     * by one thread at a time. Java under the hood uses moniters to achieve process
     * synchronization. There are also some mmethods that can be used within the
     * synchronized block that are `<shared variable>.wait()` and `<shared
     * variable>.signal()` these are used to make thread wait for some action and
     * signal the thread of some change respectively.
     */

    /*
     * Write a program to query the below table, print the Name and
     * quantity of the items and compute the total cost of all available
     * items.
     * Item_Code Description Cost Qty_Available
     * 101 Pen 10 350
     * 102 Eraser 5 200
     * 103 Pencil 3 500
     */
    // public static void main(String[] args) throws Exception {
    // JDBCExample JDBC = new JDBCExample("connection url","username","password");
    // try{
    // String result1=JDBC.executeQuery("select Name,Qty_Available from ItemTable");
    // System.out.println(result1);
    // String result2=JDBC.executeQuery("select SUM(cost*Qty_Available) as TotalCost
    // from ItemsTable");
    // System.out.println(result2);
    // }catch(SQLException e){
    // e.printStackTrace();
    // }finally{
    // JDBC.closeAllConnections();
    // }
    // }

    /*
     * What are Design Patterns and its need? On what basis are they
     * classified? Name three patterns of each category.
     * 
     * In software development life cycle design patterns refers to as common
     * problems that occours while development of code and the core of the solutions
     * to this problem, this solution is presented in such a way that it can be
     * applied millon times over to the similer problems without repeating any code,
     * these design patterns provide industry standard solutions to these problems
     * designed be expert developers. Using these design pattern:
     * 1. Highly Reduces the cost of maintaining the code.
     * 2. Highly Improves the code readability and maintainability.
     * 3. It makes it easier for any new developer joining the team to understand
     * the code if he has studied these common design patters.
     * 4. Also reduces the scope for common bugs and unpredictability as these are also taken care of in these design patters as the design patterns exensively tried and tested solutions.
     * 
     * Design Patterns are classified mainly in three categories, that is:
     * - Creational Patterns: These patterns are useful to handle logic related to creation of different objects in the software.
     * - Structural Patterns: These patterns are about different types of ways in which objects can be composed in such a way making them more use ful and reusable and independant of one another.
     * - Behavioural Patterns: These patterns are about how patterns behaves at the run time and to handle the behaviour of multiple objects so that it is pridictable.
     * 
     * 
     * Creational Patterns:
     * - JAVA Factory Pattern
     * - Abstract Factory Pattern
     * - Builder Design Pattern
     * - Prototype Design Pattern
     * - Singleton Pattern
     * 
     * Structural Patterns:
     * - Facade Pattern
     * - Proxy Pattern 
     * - Adapter Pattern
     * - Bridge Pattern
     * 
     * Behavioural Patterns:
     * - Chain of Responsibility Pattern
     * - Command Pattern
     * - Iterator Pattern
     * - Interpretor Pattern
     * - Null Object
     * - Visitor Pattern 
     * - Template Pattern
     */
}



/*
 * Creational Pattern
 * - Singleton Pattern
 * - JAVA Factory Pattern
 * - Abstract Factory Pattern
 * - Builder Design Pattern
 * 
 * Structural Pattern
 * - Bridge Pattern
 * - Facade Pattern
 * - Adapter Pattern
 * - Proxy Pattern
 * 
 * 
 * Behavioural Pattern
 * - Chain of responsiblilty Pattern 
 * - Null Object
 * - Template Pattern
 */