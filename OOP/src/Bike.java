// Exmaple of toString method in JAVA.
public class Bike {
    // toString() = Special method that all the objects inherits, that returns a string that "textually represents" an objects. <object name> can be used both implicitely and explicitely.
    String company="Suzuki";
    String name = "Access";
    int number = 1212;

    // by default this toString() method represents address of the object.
    public String toString(){
        return "\nBike Company: "+company+".\nBike Name: "+name+".\nBike Number: "+number+".";
    }
}
