import java.util.Random;

public class array {
    public static void main(String[] args) {

        String[][] indianNames = new String[10][10];

        String[] firstNames = {"Aarav", "Aadi", "Aanya", "Aarushi", "Aarya", "Aayush", "Aditi", "Advait", "Alok", "Amit"};

        Random rand = new Random();
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                int index = rand.nextInt(firstNames.length);
                indianNames[i][j] = firstNames[index];
            }
        }


        // Decleration way.
        String[] names = {"Aditya","Rahul","Vishal"};

        // Only initialization.
        String[] anotherNames = new String[3];
        
        for(int x=0;x<names.length;x++){
            System.out.println(names[x]);
            anotherNames[x]=names[x];
        }
        for(String name:anotherNames){
            System.out.println(name);
        }

        for(String[] namesP:indianNames){
            for(String name:namesP){
                System.out.print(name);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
