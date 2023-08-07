import java.util.ArrayList;

public class SumAdder {
    private ArrayList<Integer> sharedArry;
    private ArrayList<Integer> sum;

    public SumAdder(ArrayList<Integer> sharedArry,ArrayList<Integer> sum){
        this.sharedArry=sharedArry;
        this.sum=sum;
    }   


    public void calculateSum(int startIndex,int endIndex){
        synchronized(sum){
            int finalSum=0;
            for(int x=startIndex;x<endIndex;x++){
                finalSum+=sharedArry.get(x);
            }
            int previousSum=sum.get(0);
            sum.set(0, previousSum+finalSum);
        }

    }

}
