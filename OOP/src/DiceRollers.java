import java.util.Random;;

public class DiceRollers {
    // local = declared inside the method, visible only inside that method.

    // global = declared ouside a method, but within a class, visible to all the parts of the class.

    // example of global variables.
    Random random;
    int number;
    DiceRollers(){
        random = new Random();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.printf("The random number is %d.\n",number);
    }
}
