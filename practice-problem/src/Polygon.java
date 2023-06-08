public class Polygon extends Close{

    private double lengthOfOneSide;
    private int numberOfSides;

    Polygon(double l,int n){
        setLengthOfOneSide(l);
        setNumberOfSides(n);
    }

    public void setLengthOfOneSide(double lengthOfOneSide) {
        this.lengthOfOneSide = lengthOfOneSide;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double getLengthOfOneSide() {
        return lengthOfOneSide;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public double area() {
        return ((Math.pow(getLengthOfOneSide(),2))*getNumberOfSides()/2*Math.tan(Math.PI/getNumberOfSides()));
    }

    @Override
    public void display() {
        System.out.println(String.format("This is a polygon with area %f.",area()));
    }
}
