public class Line extends Open {
    private Point startPoint;
    private Point endPoint;

    Line(int sPx,int sPy,int ePx,int ePy){
        Point sP=new Point(sPx, sPy);
        Point eP=new Point(ePx, ePy);
        setStartPoint(sP);
        setEndPoint(eP);
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow(getStartPoint().xCoordinate-getEndPoint().xCoordinate,2)+Math.pow(getStartPoint().yCoordinate-getEndPoint().yCoordinate,2));
    }

    @Override
    public void display() {
        System.out.println(String.format("This is a line of length %f.",length()));
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }  
    
    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }   
}
