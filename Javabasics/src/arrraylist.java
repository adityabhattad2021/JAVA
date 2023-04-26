import java.util.ArrayList;;


public class arrraylist {
    public static void main(String[] args) {
        // ArrayList = A resizable array.
        //             Elements can be added and removed after compilation phase store reference data types.

        // Only Wrapper class of the data types goes here i.e int => Integer
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("vadapaw");
        food.add("namge");

        food.set(2, "mango");
        // food.remove(2);
        // food.clear()'
        food.set(1, "chai");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}
