import java.io.Serializable;

public class SampleObject implements Serializable {
    private String sampleString;

    public SampleObject(String str){
        this.sampleString=str;
    }

    @Override
    public String toString(){
        return sampleString+".";
    }
}
