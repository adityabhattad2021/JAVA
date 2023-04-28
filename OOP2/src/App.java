public class App {

    // abstract = Abstract class cannot be instantiated, but they can have a subclass abstract methods are declared without an implementation


    public static void main(String[] args) throws Exception {
        // Vehicle v = new Vehicle();  This will error out.
        Car c = new Car();
        System.out.println(c.getClass());
    }
}
