public class Ellipse extends Close{
    private double a;
    private double b;

    Ellipse(double a,double b){
        setA(a);
        setB(b);
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double area() {
        return 3.14*getA()*getB();
    }

    @Override
    public void display() {
        System.out.println(String.format("This is a ellipse with area: %f.",area()));
    }
}
