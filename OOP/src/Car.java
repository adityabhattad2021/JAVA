public class Car extends Vehicle {
    private String name = "Wagnor";
    private String company = "Maruti";
    private double price = 800000;

    void drive(){
        System.out.println("You are driving the car!");
    }
    void brake(){
        System.out.println("You just stopped the car!");
    }

    public void go(){
        System.out.println("Car is moving....");
    }

    public String getName(){
        return this.name;
    }
    public String getCompany(){
        return this.company;
    }
    public double getPrice(){
        return this.price;
    }
    
}
