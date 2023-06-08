public class App {
    public static void main(String[] args) throws Exception {
        Close e = new Ellipse(2.14, 3.55);
        Close p = new Polygon(2.14, 3);
        Open l = new Line(3, 4, 1, 8);

        l.display();
        e.display();    
        p.display();
    }
}
