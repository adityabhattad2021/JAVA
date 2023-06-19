public class BoundedGenericClass <T extends Number> {
    T data;

    BoundedGenericClass(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
