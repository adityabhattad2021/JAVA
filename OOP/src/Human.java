public class Human {
    String name;
    int age;
    double weight;

    // Constructors: Special function that only runs once and are mostly used to initialize global variables.
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.printf("%s is eating!\n",this.name);
    }

    void run(){
        System.out.printf("%s is running!\n",this.name);
    }

}
