import java.io.Serializable;


public class User implements Serializable {
    String name;

    // Any thing with this keyword will be ignored in serialization process.
    transient String password;

    public void sayHello(){
        System.out.println(String.format("Hello %s",name));
    }
}
