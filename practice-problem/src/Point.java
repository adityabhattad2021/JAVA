public class Point {
    public int xCoordinate;
    public int yCoordinate;

    public Point(int x,int y){
        this.xCoordinate=x;
        this.yCoordinate=y;
    }

    public int[] getCoordinates(){
        int[] coordiantes={xCoordinate,yCoordinate};
        return coordiantes;
    }

    public void display(){
        System.out.println(String.format("Coordinates are %d %d",xCoordinate,yCoordinate));
    }
}
