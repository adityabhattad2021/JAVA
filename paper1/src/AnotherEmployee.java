public class AnotherEmployee {
    private int Id;
    private String name;
    private int salary;


    AnotherEmployee(int Id,String name,int salary){
        this.Id=Id;
        this.name=name;
        this.salary=salary;
    }

    public int getId() {
        return Id;
    }   

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
