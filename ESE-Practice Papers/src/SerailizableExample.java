import java.io.Serializable;
import java.util.ArrayList;

public class SerailizableExample implements Serializable{

    private String someData;
    public ArrayList<Integer> arrayOfSomeData = new ArrayList<>();

    public SerailizableExample(String someData){
        this.someData=someData;
        for(int x=0;x<10;x++){
            arrayOfSomeData.add(x);
        }
    }

    public void printArray(){
        for(Integer e:arrayOfSomeData){
            System.out.println(e);
        }
    }

    /**
     * @return some random string.
     */
    public String getSomeData() {
        return someData;
    }
    
}
