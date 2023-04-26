public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car();

        System.out.printf("Car name is %s.\nCar manufacturer name is %s.\nCar price is Rs %,.2f\n",car1.name,car1.company,car1.price);

        car1.drive();
        car1.brake();

    }
}
