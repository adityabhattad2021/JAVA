import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("user.ser", false);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        User user = new User();
        user.setName("Aditya");

        objectOutputStream.writeObject(user);
        System.out.println(objectOutputStream.getClass());
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("user.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        User userFromFile = (User) objectInputStream.readObject();
        userFromFile.sayHello();

        objectInputStream.close();
    }
}
