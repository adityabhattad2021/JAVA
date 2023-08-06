public class GenericClassExample <T> {
    public T data;

    public GenericClassExample(T data){
        this.data=data;
    }


    @Override
    public String toString(){
        return this.data+".";
    }
}
