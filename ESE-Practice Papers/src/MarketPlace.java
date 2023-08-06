import java.util.ArrayList;
import java.util.Collections;

public class MarketPlace {
    ArrayList<Laptop> collectionOfLaptops = new ArrayList<>();

    public MarketPlace() {
        collectionOfLaptops.add(new Laptop("Model 1", 2, 12, 13, false, 45600));
        collectionOfLaptops.add(new Laptop("Model 2", 2, 15, 23, false, 46600));
        collectionOfLaptops.add(new Laptop("Model 3", 2, 8, 21, false, 54000));
        collectionOfLaptops.add(new Laptop("Model 4", 2, 4, 6, false, 15600));
        collectionOfLaptops.add(new Laptop("Model 5", 2, 19, 130, true, 95600));
    }

    public void displayAccordingToCost(){
        Collections.sort(collectionOfLaptops,(Laptop laptop1,Laptop laptop2)->{   
            return Double.compare(laptop1.getCost(),laptop2.getCost());   
        });
        for(Laptop l:collectionOfLaptops){
            System.out.println(l);
        }
    }

    public void displayAccordingToDiskSize(){
        Collections.sort(collectionOfLaptops,(Laptop l1,Laptop l2)->{
            return Integer.compare(l1.getDiskSize(),l2.getDiskSize());
        });
        for(Laptop l:collectionOfLaptops){
            System.out.println(l);
        }
    }
    public void displayAccordingToRAM(){
        Collections.sort(collectionOfLaptops,(Laptop l1,Laptop l2)->{
            return Integer.compare(l1.getRAM(),l2.getRAM());
        });
        for(Laptop l:collectionOfLaptops){
            System.out.println(l);
        }
    }

    public void displayAccordingToScreenSize(){
        Collections.sort(collectionOfLaptops,(Laptop l1,Laptop l2)->{
            return Double.compare(l1.getScreenSize(),l2.getScreenSize());
        });
        for(Laptop l:collectionOfLaptops){
            System.out.println(l);
        }
    }
    
}
