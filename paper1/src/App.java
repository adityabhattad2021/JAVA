public class App {
    public static void main(String[] args) throws Exception {

        /*
            Design a class Employee, having String companyname, String
            dept, String position and Employee reportingManager.
            Create another class Office having an array of employees where
            each must have a manager except one. Write a method
            displayAllManagersOf(Employee e) which will display all the
            managers of employee e and a method displayAll(String position)
            to display all employee working on that position.
            [For example: Given a object hierarchy as follows:

            Output of displayAllManagersOf(object13), must display details of
            below employee objects in the given order:-> object8, object4,
            object1
            Output of displayAll(“ProjectManager”) must display the details
            of object2, object3 and object4]
         */
        Office o = new Office();
        // o.displayAll("Team Leader");
        o.displayAllManagers(o.getEmployeeByNumber(13));


        /*
            What is an interface? Why is it used in Java? Can we create an
            anonymous class using an interface? Demonstrate with an
            example.
            Explain the concept of functional interfaces and how they are used
            for writing Lambda Expressions. Illustrate with sample code how
            lambda expressions significantly reduce the lines of code in a Java
            program.
        */


        /*
         * Explain the following terms related to exception handling in Java:
            A. try
            B. catch
            C. throw
            D. throws
            E. finally
            Can a try catch block replace a conditional statement like if-else or
            switch case? If yes, then how? If no, then why?
            =>
            Try: The "try" block is used to enclose the code that might throw an exception. It allows you to specify a block of code that you want to monitor for exceptions.
            Catch: The "catch" block follows a "try" block and is used to catch and handle specific exceptions that might be thrown by the code within the "try" block. It contains code that is executed only if an exception of the specified type occurs.
            Throw: Syntax to throw an error
            e.g. throw new ErrorName();
            Throws: This can be added in the function signature that what kind of the error is expected to be thrown by the function.
            Finally: The code written inside the finally block will be executed irrespective of where or  node code written inside the code inside the try block fails, It is generally used for cleanup operations, such as closing files or releasing resources.
            Try, Catch blocks cannot replace the if-else statements as there is no way to check any condition in try and catch block. Try can catch block can only be used for the purpose of error handling.
         */
        
    }
}
