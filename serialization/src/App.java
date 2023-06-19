import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Serialization = The process of converting an object into a byte stream.
         * Persists (saves the state) the object after the program exits.
         * This byte stream can be saved as a file or sent over a network
         * and canbe sent to a different machine.
         * Byte stream can be saved as a file (.ser) which is platform
         * indepent (think of it as if you are saving a file with
         * objects information.
         * 
         * Deserialization = This is a reverse process of serialization, i.e. converting
         * a
         * byte stream into an object. (Like loading a saved file)
         */

        /*
         * Steps to serialize an object.
         * 1. Your object class should implement the Serialiazable interface.
         * 2. Add import java.io.Serialiazable;
         * 3/ FileOutputStream fileoutput = new FileOutputStream(file path);
         * ObjectOutputStream out = new ObjectOutputStream(fileoutput);
         * out.writeObject(objectname);
         * out.close(); fileout.close()
         */
        User user = new User();

        // String currentDirectory = System.getProperty("user.dir");
        // System.out.println("Current Working Directory: " + currentDirectory);

        user.name = "Aditya";
        user.password = "iHatepasswords";

        FileOutputStream fileOut = new FileOutputStream("UserClassState.ser", false);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOut);

        outputStream.writeObject(user);
        fileOut.close();
        outputStream.close();
        System.out.println("Object info saved!");

        /*
         * Steps to deserialize
         * 1. Declare your object (don't instantiate)
         * 2. Your class should implement Serializable interface.
         * 3. Add import java.io.Serializable
         * 4. FileInputStream fileIn = new FileInputStream(file path);
         * 5. ObjectInputStream in = new ObjectInputStream(fileIn);
         * 6. objectName = (Class) in.readObject();
         * 7. in.close();
         * 8. fileIn.close();
         */

        User dUser = null;

        FileInputStream fileIn = new FileInputStream("UserClassState.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        dUser = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(dUser.name);
        System.out.println(dUser.password);
        dUser.sayHello();

    }
}
