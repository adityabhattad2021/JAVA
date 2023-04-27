public class App {
    public static void main(String[] args) throws Exception {
        // Car car1 = new Car();

        // System.out.printf("Car name is %s.\nCar manufacturer name is %s.\nCar price is Rs %,.2f\n",car1.name,car1.company,car1.price);

        // car1.drive();
        // car1.brake();

        // Human h1 = new Human("Pratik",21,54.2);
        // Human h2 = new Human("Suresh",23,64.2);

        // h1.eat();
        // h2.run();

        // DiceRollers dRoller = new DiceRollers();

        // for(int x=0;x<10;x++){
        //     dRoller.roll();
        // }

        // Student a = new Student("Rahul",1,2.3);
        // Student b = new Student("Vivek",4);
        // Student c = new Student("Pratik");
        // Student d = new Student();

        // a.getStudent();
        // b.getStudent();
        // c.getStudent();
        // d.getStudent();

        // Bike b=new Bike();

        // Explict calling of toString method
        // System.out.println(b.toString());

        // Implicit calling of toString method
        // System.out.println(b);

        // Both will have the same output.

        Food[] refrigerator = new Food[3];

        Food f1 = new Food("Apple");
        Food f2 = new Food("Samosa");
        Food f3 = new Food("Beriyani");

        refrigerator[0]=f1;
        refrigerator[1]=f2;
        refrigerator[2]=f3;

        for(Food food:refrigerator){
            System.out.println(food);
        }

    }
}
