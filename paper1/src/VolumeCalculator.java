public class VolumeCalculator {

    public static void main(String[] args) {
        System.out.println(calculateVolume(1.2, 3.2));
    }

    public static double calculateVolume(double radius,double height){
        return 3.14*radius*radius*height;
    }

    public static double calculateVolume(int length,int breadth,int height){
        return length*breadth*height;
    }
}